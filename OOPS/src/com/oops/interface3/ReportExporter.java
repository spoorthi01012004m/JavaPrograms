package com.oops.interface3;

public interface ReportExporter {
	void exportReport();

	public default void validateReport() {
		isReportEmpty();
		System.out.println("ReportExporter.validateReport()");
	}

	public default void isSupportedFormat(String fileFormat) {
		isReportEmpty();
		System.out.println("ReportExporter.isSupportedFormat().......");
	}

	private void isReportEmpty() {
		System.out.println("ReportExporter.isReportEmpty()");
	}

}
