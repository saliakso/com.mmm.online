package com.mmm.online.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmm.online.utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='login-nav']//button[1]")
	public WebElement mainLogin;
	
	@FindBy(id="root_email")
	public WebElement email;
	
	@FindBy(id="root_password")
	public WebElement pwd;
	
	@FindBy(xpath="//button[@class='HMIRegistration__submit'][contains(text(),'Login')]")
	public WebElement loginButton;
	
	@FindBy(xpath ="//*[@id='modal-register']/div/div/div[2]/button")
	public WebElement closeXbutton;

}
