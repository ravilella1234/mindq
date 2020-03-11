package com.browsers;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest
{
	private static final  Logger log=Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("initializing the properties files");
		
		openBrowser("chromebrowser");
		log.info("Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + subenv.getProperty("amazonurl") );
		
		selectOption("amazondropbox_id","Books");
		
		type("amazonsearchtext_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
				
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
	}
}
