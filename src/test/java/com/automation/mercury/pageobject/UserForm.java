package com.automation.mercury.pageobject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.mercury.util.BrowserFactory;
import com.automation.mercury.util.CommonUtil;

public class UserForm {
	private static WebDriver driver = null;

	public UserForm(WebDriver driver) {
		this.driver = driver;
	}



}
