package org.javaacadmey.toyota.car.exeptions;

import org.javaacadmey.toyota.car.utils.FileWriterReport;

public class AssemblyRequestException extends Exception {
    public AssemblyRequestException(String message) {
        super(message);
        FileWriterReport fileWriterReport = new FileWriterReport();
        fileWriterReport.writeReportToFile(message, "error");
    }
}
