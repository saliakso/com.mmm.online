package com.mmm.online.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mmm.online.utilities.Driver;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath="//a[@id='continue-link']")
	public WebElement continuesPage;
	
	@FindBy(xpath="//[@id=\"secondary-wrap\"]/div/button[2]")
	public WebElement register;
	
	@FindBy(xpath="(//input[@id='root_subscriber_email'])[2]")
	public WebElement emailInputBox;
	
	@FindBy(id="root_subscriber_firstName")
	public WebElement firstnameInputBox;
	
	@FindBy(id="root_subscriber_lastName")
	public WebElement lastName;
	
	@FindBy(id="root_registerPassword_password")
	public WebElement password;
	
	
	@FindBy(id="root_business_company")
	public WebElement companyName;
	
	@FindBy(id="root_business_jobTitle")
	public WebElement jobTitle;
	
	@FindBy(xpath="(//button[@class='HMIRegistration__submit'])[3]")
	public WebElement registerBox;
	
	@FindBy(css=".buttonauth:nth-child(2)")
	public WebElement myAccount;
	
	@FindBy(css=".buttonauth:nth-child(1)")
	public WebElement logOut;
	
	public String getSaltString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}

