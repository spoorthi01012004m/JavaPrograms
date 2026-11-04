package com.oops.overloading;

public class DocumentExportApplication {
	// export only content
	public void exportReport(String content) {
		System.out.println("Report exported successfully!!");
	}

	// export report content with specific file name
	public void exportReport(String content, String fileName) {
		System.out.println("File name: " + fileName + " Exported successfully");
	}

	// export report with content , file name and export format
	public void exportReport(String content, String fileName, String exportFormat) {
		if (exportFormat == "PDF" || exportFormat == "CSV" || exportFormat == "TXT") {
			System.out.println("File Name: " + fileName + " Exported successfully");
		}

	}

}
