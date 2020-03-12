package com.browsers;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{
	private static final  Logger log=Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		test=report.startTest("TC_003");
		log.info("initializing the properties files");
		test.log(LogStatus.INFO, "initializing the properties files");
		
		
		
		openBrowser("chromebrowser");
		log.info("Opened the browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.PASS, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + subenv.getProperty("amazonurl") );
		test.log(LogStatus.PASS, "Navigated to url :- " + subenv.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","dropvalue");
		log.info("Selected the option :- " + mainenv.getProperty("dropvalue") + " by using the locator :- " + mainenv.getProperty("amazondropbox_id"));
		test.log(LogStatus.INFO, "Selected the option :- " + mainenv.getProperty("dropvalue") + " by using the locator :- " + mainenv.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_id","textvalue");
		log.info("Entered the text :- " + mainenv.getProperty("textvalue") + " by using the locator :- " + mainenv.getProperty("amazonsearchtext_id"));
		test.log(LogStatus.INFO, "Entered the text :- " + mainenv.getProperty("textvalue") + " by using the locator :- " + mainenv.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on element by using the locator :- " + mainenv.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.INFO, "Clicked on element by using the locator :- " + mainenv.getProperty("amazonsearchbutton_xpath"));
		
		
		report.endTest(test);
		report.flush();
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
				
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
	}
}
