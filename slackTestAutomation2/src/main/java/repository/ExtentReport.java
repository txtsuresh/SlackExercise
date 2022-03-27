package repository;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	
	public ExtentReports getreports() {
		
		String path = System.getProperty("user.dir")+ "\\report\\testReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Results");
		reporter.config().setReportName("Slack Automation Scripts");
		
		ExtentReports report = new ExtentReports ();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Suresh Ganesan");
		return report;
		
	}
}
