package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.automation.mercury.pageobject.AdminLogin;
import com.automation.mercury.pageobject.UserForm;
import com.automation.mercury.pageobject.UserList;
import com.automation.mercury.util.BrowserFactory;
import com.automation.mercury.util.CommonUtil;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition{

	 WebDriver driver;
	 @Before
	    public void setUp() throws IOException {
		 String brn=CommonUtil.getPropertyValue("config", "bname");
			String run_mode=CommonUtil.getPropertyValue("config", "rmode");
			String url=CommonUtil.getPropertyValue("config", "url");
			WebDriver driver=BrowserFactory.getBrowser(brn, run_mode);
			BrowserFactory.openURL(url);
	        AdminLogin al=new AdminLogin(driver);
	        PageFactory.initElements(driver, al);
	        UserList ul=new UserList(driver);
	        PageFactory.initElements(driver, ul);
	    }
	
	 @Given("^admin is already on Logged in$")
	 public void admin_is_already_on_Logged_in() throws IOException, InterruptedException{

		 
			String username=CommonUtil.getPropertyValue("config", "adminUsername");
			String password=CommonUtil.getPropertyValue("config", "password");
			AdminLogin.login(username, password);
			
}
	
	 @When("^admin delete a user by clicking on more options$")
	 public void admin_delete_a_user_by_clicking_on_more_options() throws Throwable {
		 
		 UserList.clickOnUsers();
		 UserList.clickOnDots();
		
		 
			
			
			
	 }
	 @And("^admin clicks on delete$")
	 public void admin_clicks_on_delete(){
	 
		 UserList.clickOnDelete();
			}
	
	 @Then("^admin confirms to delete$")
	 public void admin_confirms_to_delete(){
	 
		 
			}
	 @Then("^user should be deleted successfully$")
	 public void user_should_be_deleted_successfully(){
		 System.out.println("user should be deleted successfully");
	 }
	

	
	
}


