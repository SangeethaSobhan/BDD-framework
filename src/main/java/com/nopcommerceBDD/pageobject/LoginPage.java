package com.nopcommerceBDD.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver driver;
	HomePage homePage;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Email")
	WebElement username;
	
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='buttons']")
	WebElement login;
	
	
	
	public void setusername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
		
	}
	public void setpassword(String pasword)
	{
		password.clear();
		password.sendKeys(pasword);
		
	}
	
	public HomePage clickOnLogin()
	{
		login.click();
		return new HomePage(driver);
		
		
	}
	
	
	public String getTittle()
	{
		String tittle=driver.getTitle();
		return tittle;
	}
	
}
