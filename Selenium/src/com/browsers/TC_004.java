package com.browsers;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		test=report.startTest("TC_004");
		test.log(LogStatus.INFO, "initializing the properties files");
		
		openBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + subenv.getProperty("amazonurl"));
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\amazon.png"));
		
		report.endTest(test);
		report.flush();
		
	}
}
