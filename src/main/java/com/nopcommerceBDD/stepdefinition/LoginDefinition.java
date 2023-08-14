package com.nopcommerceBDD.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;


import com.nopcommerceBDD.base.BaseClass;
import com.nopcommerceBDD.pageobject.HomePage;
import com.nopcommerceBDD.pageobject.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDefinition extends BaseClass {
	
	public LoginPage loginpage;
	public HomePage homepage;
	
	
	@Before
	 
	 public void lConfig()
	 {
		 loadConfig();
	 }
	 
	 
	@Given("launch chromebrowser")
	public void launch_chromebrowser() {
		launchApp();
	    
	}

	@When("user open url")
	public void user_open_url() {
		openURL();

	   
	}

	@And("User enter email as {string} and password {string}")
	public void user_enter_email_as_and_password(String uname, String password)
	{   loginpage=new LoginPage(driver);
	
		loginpage.setusername(uname);
		loginpage.setpassword(password);
		
	}
	    

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		
		
		Thread.sleep(3000);
		homepage=loginpage.clickOnLogin();
		
	    
	}

	@Then("page tittle should be{string}")
	public void pageTittleShouldBe(String tittle) {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
	Assert.assertEquals(tittle, driver.getTitle());
		}
		
	}
	
	@When("User click on logout link")
public void user_click_on_logout_link() throws InterruptedException {
		loginpage=homepage.clickLogOut();
		
	}

	    
	

	@And("close browser")
	public void close_browser() {
	    tearDown();
	}

}
