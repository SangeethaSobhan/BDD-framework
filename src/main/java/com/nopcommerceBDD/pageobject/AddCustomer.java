package com.nopcommerceBDD.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerceBDD.base.BaseClass;

public class AddCustomer extends BaseClass {
	public WebDriver driver;
	
	
	public AddCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement firstName;
	
	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement genderMaleRadio;
	
	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement genderFemaleRadio;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement dateOfbirth;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement isTaxEmptedCheckBox;
	
	@FindBy(xpath="//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']")
	WebElement newsLetter;
	
	@FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_taglist']")
	WebElement customerRole;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement mangerOfVendor;
	
	@FindBy(xpath="//input[@id='Active']")
	WebElement activeCheckbox;
	
	 @FindBy(xpath="//textarea[@id='AdminComment']")
	 WebElement adminComment;
	 
	 @FindBy(xpath="//button[@name='save']")
	 WebElement saveButton;
	 
	 
	 public void enterEmail(String Email) {
      action.type(email, Email);
		 
	 }
	 
	 public void EnterPassword(String pass)
	 {
		 action.type(password, pass);
	 }
	
	public void enterFirstName(String name) {
		action.type(firstName,name );
	}
	
	public void enterLastName(String name) {
		action.type(lastName, name);
	}

}
