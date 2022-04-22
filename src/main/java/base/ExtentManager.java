package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;

public class ExtentManager {//https://www.youtube.com/watch?v=Lapn6VLoqdc
	
	private static ExtentReports extent;
	
	public static ExtentReports createInstance() {
		
		String fileName= getReportName();
		String directory = System.getProperty("user.dir")+"/reports/";
		new File(directory).mkdirs();
		String path = directory + fileName;
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.setSystemInfo("Organisation", "TCS");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);
		return extent;
		
	}
	
	public static String getReportName() {
		Date d= new Date();
		String fileName = "AutomationReport_" + d.toString().replace(":","-").replace("","_")+".html";
		return fileName;
		
	}

}