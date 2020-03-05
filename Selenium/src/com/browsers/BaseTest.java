package com.browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	}
	
	public static void openBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drive\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\drive\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(subenv.getProperty(url));
		driver.navigate().to(subenv.getProperty(url));
	}
	

}
