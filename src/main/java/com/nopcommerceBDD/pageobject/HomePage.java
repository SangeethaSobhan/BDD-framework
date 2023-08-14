package com.nopcommerceBDD.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.en.When;

public class HomePage {
	WebDriver driver;
	LoginPage loginpage;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	
	@FindBy(xpath="//a[@href='#']/i[@class='nav-icon far fa-user']")
	WebElement customersMenu;
	
	@FindBy(xpath="//p[text()=' Customers']")
	WebElement customersMenuItem;
	
	
	
	
	public String getTittle()
	{
		String tittle=driver.getTitle();
		return tittle;
	}
	
	
	public LoginPage clickLogOut() throws InterruptedException {
		Thread.sleep(3000);
		
		logout.click();
		
		return new LoginPage(driver);
		   
		
	}
	}
	
