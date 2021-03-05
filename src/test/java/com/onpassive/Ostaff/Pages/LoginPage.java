package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;

public class LoginPage extends Basepage {


	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// User name webelement
	@FindBy(id = "mat-input-0")
	WebElement username;

	// Password webelemnt
	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement password;

	// Show password
	@FindBy(xpath = "//*[text()='visibility_off']")
	WebElement showpassword;

	// Login button webelement
	// @FindBy(xpath="//div[@class='login-button col-sm-12']")
	 //@FindBy(xpath = "//*[text()='Login Here']")
	@FindBy(xpath = "//*[@class='login-button w-100 mt-2 mb-3']")
	WebElement loginbutton;


	// invalid success
	@FindBy(xpath = "//div[@aria-label='UserName Or Password Is Wrong']")
	WebElement WrongMessage;

	/*
	 * public LoginPage() { PageFactory.initElements(driver, LoginPage.class); }
	 */

	// Setup user name
	public void uname(String name) {
		// username.clear();
		username.sendKeys(name);
		String value = username.getAttribute("value").toLowerCase();
		System.out.println("User name input data is: " + value.toUpperCase());
	}

	// Setup password
	public void pasword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
		String value = password.getAttribute("value").toUpperCase();
		System.out.println("Password input data is: " + value.toUpperCase());
	}

	// Setup login operation
	public void login() {
		Actions builder = new Actions(driver);
		builder.moveToElement(loginbutton).click(loginbutton);
		builder.perform();

		// loginbutton.click();
	}

	public void showpsd() {
		showpassword.click();
	}

}
