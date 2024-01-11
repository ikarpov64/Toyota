package org.javaacadmey.toyota.car.exeptions;

import org.javaacadmey.toyota.car.utils.FileWriterReport;

public class NoCarAvailableException extends Exception{
    public NoCarAvailableException(String message) {
        super(message);
        FileWriterReport fileWriterReport = new FileWriterReport();
        fileWriterReport.writeReportToFile(message, "exception");
    }
}
