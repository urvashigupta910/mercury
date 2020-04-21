package com.automation.mercury.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.mercury.util.CommonUtil;

public class AdminLogin {
	private static WebDriver driver = null;
	

	public AdminLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void login(String username,String password) throws IOException
	{
		
		WebElement e1= driver.findElement(By.id("username"));
		e1.sendKeys(username);
		WebElement e2= driver.findElement(By.id("password"));
		e2.sendKeys(password);
		WebElement e3= driver.findElement(By.xpath("//*[@btntext='login.login.label']"));
		e3.click();
		
	}
}
