package com.oops.interface3;

public class CSVExporter implements ReportExporter{
	private final String standarFileFormat = "CSV";
    
	
	@Override
	public void exportReport() {
		System.out.println("CSVExporter.exportReport()");
		
	}
	
	@Override
	public void validateReport() {
		ReportExporter.super.validateReport();
		System.out.println("CSVExporter.validateReport()........");
	}
	@Override
	public void isSupportedFormat(String fileFormat) {
		ReportExporter.super.isSupportedFormat(fileFormat);
		if(fileFormat.equals(standarFileFormat)) {
			System.out.println("CSVExporter.isSupportedFormat().......Format approved");
		}
		else 
			System.out.println("File format is wrong.....");
	}

}
