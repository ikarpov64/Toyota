package org.javaacadmey.toyota.car.exeptions;

public class NoFreeSpaceInWarehouseException extends Throwable {
    public NoFreeSpaceInWarehouseException(String message) {
        super(message);
    }
}
