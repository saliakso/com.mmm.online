package com.mmm.online.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmm.online.pages.LoginPage;
import com.mmm.online.utilities.Driver;

import cucumber.api.java.en.When;

public class LoginStepDefinition {
	LoginPage lp = new LoginPage();

	@When("User click on the login button")
	public void user_click_on_the_login_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
		wait.until(ExpectedConditions.visibilityOf(
				Driver.getDriver().findElement(By.cssSelector("#modal-register button.js-fr-dialogmodal-close"))));
		Driver.getDriver().findElement(By.cssSelector("#modal-register button.js-fr-dialogmodal-close")).click();
		lp.mainLogin.click();
	}

	@When("User enter valide email and Password")
	public void user_enter_valide_email_and_Password() {
		lp.email.sendKeys("alan61@gmail.com");
		lp.pwd.sendKeys("abcd4321");

	}

	@When("User click login botton")
	public void user_click_login_botton() {
		lp.loginButton.click();
	}
}
