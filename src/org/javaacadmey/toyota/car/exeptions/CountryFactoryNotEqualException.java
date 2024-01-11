package org.javaacadmey.toyota.car.exeptions;

import org.javaacadmey.toyota.car.utils.FileWriterReport;

public class CountryFactoryNotEqualException extends Exception {
    public CountryFactoryNotEqualException(String message) {
        super(message);
        FileWriterReport fileWriterReport = new FileWriterReport();
        fileWriterReport.writeReportToFile(message, "exception");
    }
}
