package com.mmm.online.steps;

import java.util.concurrent.TimeUnit;

import com.mmm.online.pages.RegisterPage;
import com.mmm.online.utilities.ConfigurationReader;
import com.mmm.online.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {
	
	@Given("User go to website")
	public void user_go_to_website() {
		//Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		//Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RegisterPage cont =new RegisterPage();
		cont.continuesPage.click();
	}

	@When("user click on register botton")
	public void user_click_on_register_botton() {
		//RegisterPage rg =new RegisterPage();
		//rg.register.click();
	}
	
	@When("user enter email and User firstname and User lastname and password and Company name")
	public void user_enter_email_and_User_firstname_and_User_lastname_and_password_and_Company_name()  {	
		RegisterPage text =new RegisterPage();
		String email = text.getSaltString()+"@gmail.com";
		text.emailInputBox.sendKeys(email);
		text.firstnameInputBox.sendKeys("Mike");
		text.lastName.sendKeys("Walker");
		text.password.sendKeys("abcd4321");
		text.companyName.sendKeys("Haymarket");
	    text.jobTitle.sendKeys("SDET I");
		text.registerBox.click();	
	}

	@Then("select country")
	public void select_country() {
	   
	}

	@Then("select email newsletters")
	public void select_email_newsletters() {
	    
	}

	@Then("Click the register buttom")
	public void click_the_register_buttom() {
	  
	}

	@Then("the user verify on the dasboard page")
	public void the_user_verify_on_the_dasboard_page() throws InterruptedException {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RegisterPage dashboard =new RegisterPage();
		dashboard.logOut.click();
		
	}
	
}
