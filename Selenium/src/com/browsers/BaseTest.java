package com.browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainenv;
	public static Properties subenv;
	public static String projectPath=System.getProperty("user.dir");
	
	public static void init() throws Exception
	{
		fis=new FileInputStream(projectPath+"\\data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"\\environment.properties");
		mainenv=new Properties();
		mainenv.load(fis);
		String e = mainenv.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectPath+"\\"+e+".properties");
		subenv=new Properties();
		subenv.load(fis);
		String url = subenv.getProperty("amazonurl");
		System.out.println(url);
		
		fis=new FileInputStream(projectPath+"\\log4jconfig.properties");
		PropertyConfigurator.configure(fis);
	}
	
	public static void openBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drive\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 5");
			option.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\drive\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("mindq");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			
			
			driver=new FirefoxDriver(option);
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(subenv.getProperty(url));
		driver.navigate().to(subenv.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) {
		//driver.findElement(By.xpath(locator)).click();
		getElement(locatorKey).click();
		
	}

	public static void type(String locatorKey, String value) {
		//driver.findElement(By.name(locatorKey)).sendKeys(value);
		getElement(locatorKey).sendKeys(value);
	}

	public static void selectOption(String locatorKey, String option) {
		//driver.findElement(By.id(locatorKey)).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
	}

	public static WebElement getElement(String locatorKey) 
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element=driver.findElement(By.className(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linkTest")) {
			element=driver.findElement(By.linkText(mainenv.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			element=driver.findElement(By.partialLinkText(mainenv.getProperty(locatorKey)));
		}
		
		return element;
	}
	

}
