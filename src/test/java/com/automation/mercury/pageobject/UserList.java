package com.automation.mercury.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.mercury.util.CommonUtil;

public class UserList {
	private static WebDriver driver = null;

	public UserList(WebDriver driver) {
		this.driver = driver;
	}

}
