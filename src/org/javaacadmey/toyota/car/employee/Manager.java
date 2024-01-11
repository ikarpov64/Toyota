package org.javaacadmey.toyota.car.employee;

import org.javaacadmey.toyota.car.Customer;
import org.javaacadmey.toyota.car.utils.FileWriterReport;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.CarColor;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Manager {
    private final String name;
    private final Report report;

    public Manager(String name) {
        this.name = name;
        this.report = new Report(name);
    }

    public Car sellCar(Customer customer, Warehouse warehouse,
                       AssemblyLine assemblyLine) throws NoCarAvailableException {
        Car mostExpensiveCar = null;
        int customerMoney = customer.getAmountOfMoney();
        Price price = Price.getMaxCarBySellPrice(customerMoney);

        if (price == null) {
            System.out.printf("К сожалению, %s, у Вас не хватает денег на покупку. " +
                    "Вы уходите ни с чем.\n", customer.getName());
        } else {
            try {
                mostExpensiveCar = mostExpensiveCar(customerMoney, warehouse);
                customer.reduceAmountOfMoney(price.getSellPrice());
                updateReport(mostExpensiveCar);
                System.out.printf("Поздравляю %s! Вы купили %s за %s.\n",
                        customer.getName(),
                        mostExpensiveCar.getPrice().getModel(),
                        mostExpensiveCar.getPrice().getSellPrice());
            } catch (NoCarAvailableException e) {
                try {
                    sendRequestForAssembly(price, assemblyLine, warehouse);
                    return sellCar(customer, warehouse, assemblyLine);

                } catch (NoCarAvailableException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        return mostExpensiveCar;
    }

    private void updateReport(Car car) {
        report.addCarToReport(car);
    }

    public void generateReport() {
        FileWriterReport fileWriterReport = new FileWriterReport();

        double income = 0;
        double outcome = 0;
        StringBuilder reportText = new StringBuilder();
        Car[] cars = report.getCars();
        for (int i = 0; i < cars.length; i++) {
            income += cars[i].getPrice().getSellPrice();
            outcome += cars[i].getPrice().getCostPrice();
            reportText.append(String.format("Модель №%s (%s) - стоимость продажи: %s, себестоимость: %s.\n",
                    i + 1,
                    cars[i].getPrice().getModel(),
                    cars[i].getPrice().getSellPrice(),
                    cars[i].getPrice().getCostPrice()));
        }
        double profit = income - outcome;
        reportText.append(String.format("Итог: доходы - %s, расходы - %s, прибыль - %s\n",
                income, outcome, profit));
        fileWriterReport.writeReportToFile(reportText.toString(), this.name);
    }

    private Car mostExpensiveCar(int customerMoney, Warehouse warehouse) throws NoCarAvailableException {
        if (customerMoney >= Price.DYNA.getSellPrice() && warehouse.dynasQty() > 0) {
            return warehouse.getDyna();
        } else if (customerMoney >= Price.HIANCE.getSellPrice() && warehouse.hiancesQty() > 0) {
            return warehouse.getHiance();
        } else if (customerMoney >= Price.SOLARA.getSellPrice() && warehouse.solarasQty() > 0) {
            return warehouse.getSolara();
        } else if (customerMoney >= Price.CAMRY.getSellPrice() && warehouse.camrysQty() > 0) {
            return warehouse.getCamry();
        }
        throw new NoCarAvailableException("Нет машин в наличии");
    }

    private void sendRequestForAssembly(Price price, AssemblyLine assemblyLine, Warehouse warehouse) {
        if (price == Price.DYNA) {
            warehouse.addDyna(assemblyLine.createDyna(CarColor.BLACK.getColorName(), price));
        } else if (price == Price.HIANCE) {
            warehouse.addHiance(assemblyLine.createHiance(CarColor.BLACK.getColorName(), price));
        } else if (price == Price.SOLARA) {
            warehouse.addSolara(assemblyLine.createSolara(CarColor.BLACK.getColorName(), price));
        } else {
            warehouse.addCamry(assemblyLine.createCamry(CarColor.BLACK.getColorName(), price));
        }
    }

//   private Car findMostExpensiveCar(Warehouse warehouse, int budget) {
//        Car mostExpensiveCar = null;
//        if (warehouse.getCarQty() == 0) {
//            return mostExpensiveCar;
//        }
//
//        Car[][] cars = {
//                warehouse.getSolaras(), warehouse.getCamrys(),
//                warehouse.getDynas(), warehouse.getHiances()};
//
//        for (Car[] models : cars) {
//            for (Car car : models) {
//                if (car.getPrice().getSellPrice() <= budget &&
//                        (mostExpensiveCar == null ||
//                                car.getPrice().getSellPrice() > mostExpensiveCar.getPrice().getSellPrice())) {
//                    mostExpensiveCar = car;
//                }
//            }
//        }
//        return mostExpensiveCar;
//    }
}
