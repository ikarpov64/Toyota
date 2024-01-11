package org.javaacadmey.toyota.car.exeptions;

import org.javaacadmey.toyota.car.utils.FileWriterReport;

public class StartCarException extends Exception {
    public StartCarException(String message) {
        super(message);
        FileWriterReport fileWriterReport = new FileWriterReport();
        fileWriterReport.writeReportToFile(message, "exception");
    }


}
