package com.automation.mercury.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.mercury.util.BrowserFactory;
import com.automation.mercury.util.CommonUtil;

public class UserList extends BrowserFactory  {
	private static WebDriver driver = null;

	public UserList(WebDriver driver) {
		this.driver = driver;
	}
	public static void clickOnUsers()
	{
		 WebElement user=driver.findElement(By.xpath("//a[@href='/admin/user']"));
		user.click();
	}
	public static void clickOnDots()
	{
		WebElement e= driver.findElement(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0'][1]//td[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word']//span[2]//i[@class='anticon anticon-ellipsis']"));
		e.click();
	}
	public static void clickOnDelete()
	{
		WebElement delete=driver.findElement(By.linkText("Delete"));
		delete.click();
	}
	public static void clickOnConfirmDelete()
	{
		WebElement yes=driver.findElement(By.partialLinkText("Yes"));
		yes.click();
	}
	
	
}
