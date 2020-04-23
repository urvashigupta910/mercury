package com.automation.mercury.util;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	private static WebDriver driver=null;
	
	public static WebDriver getBrowser(String bname,String rm )
	{
		if(BrowserFactory.driver==null)
		{
			String os = System.getProperty("os.name").toLowerCase();
			System.out.println("OS = " + os );
			if (os.equalsIgnoreCase("windows 10"))
			{
			if(rm.equalsIgnoreCase("remote"))
			{
				
			}
			else if(rm.equalsIgnoreCase("local"))
			{
				if(bname.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "./BrowserExe/chromedriver.exe");
					BrowserFactory.driver=new ChromeDriver();
					Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
					String browserName = caps.getBrowserName();
					  String browserVersion = caps.getVersion();
					  System.out.println("Browser name ::"+ browserName+ "  Browser version ::"+browserVersion);
					
					
				}
				else if(bname.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "./BrowserExe/geckodriver.exe");
					BrowserFactory.driver=new FirefoxDriver();
				}
				else if(bname.equalsIgnoreCase("IE"))
				{
					System.setProperty("webdriver.ie.driver", "./BrowserExe/IEDriverServer.exe");
					BrowserFactory.driver=new InternetExplorerDriver();
				}
			}
			}
			else if(os.equalsIgnoreCase("linux"))
			{
				if(rm.equalsIgnoreCase("remote"))
				{
					
				}
				else if(rm.equalsIgnoreCase("local"))
				{
					if(bname.equalsIgnoreCase("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", "./BrowserExe/chromedriver");
						BrowserFactory.driver=new ChromeDriver();
						 Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
						  String browserName = caps.getBrowserName();
						  String browserVersion = caps.getVersion();
						  System.out.println("Browser name ::"+ browserName+ "  Browser version ::"+browserVersion);
						
					}
					else if(bname.equalsIgnoreCase("firefox"))
					{
						System.setProperty("webdriver.gecko.driver", "./BrowserExe/geckodriver.exe");
						BrowserFactory.driver=new FirefoxDriver();
					}
					else if(bname.equalsIgnoreCase("IE"))
					{
						System.setProperty("webdriver.ie.driver", "./BrowserExe/IEDriverServer.exe");
						BrowserFactory.driver=new InternetExplorerDriver();
					}
				}
				
			}
		}
		return BrowserFactory.driver;
	}
	
	public static void openURL(String appURL)
	{
		BrowserFactory.driver.get(appURL);
		BrowserFactory.driver.manage().window().maximize();
		BrowserFactory.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
