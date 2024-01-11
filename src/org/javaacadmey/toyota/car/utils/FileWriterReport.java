package org.javaacadmey.toyota.car.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReport {
    private static final String REPORTS_FOLDER_PATH = "reports";

    public FileWriterReport() {
        createReportFolder();
    }

    private void createReportFolder() {
        File reportsFolder = new File(REPORTS_FOLDER_PATH);
        if (!reportsFolder.exists()) {
            reportsFolder.mkdirs();
        }
    }

    public void writeReportToFile(String reportText, String managerName) {
        String fileName = String.format("report_%s.txt", managerName);
        String filePath = REPORTS_FOLDER_PATH + File.separator + fileName;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(reportText);
            System.out.println("Отчет успешно записан в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Не удалось записать отчет в файл. " + e.getMessage());
        }
    }
}
