package com.onpassive.Ostaff.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeOnboarding {
	WebDriver driver;

	// adding employee data option(+)

	// Basic information webelements

	// Joing Date selection
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[1]")
	WebElement DateOfJoining;

	// First name input data
	@FindBy(xpath = "//input[@id='mat-input-2']")
	WebElement Firstname;

	// Middle name input data
	@FindBy(xpath = "//input[@id='mat-input-3']")
	WebElement MiddleName;

	// Last name input data
	@FindBy(xpath = "//input[@id='mat-input-4']")
	WebElement lastName;

	/*
	 * @FinaBY(xpath="") WebElement ;
	 */

	// Mobile number
	@FindBy(xpath = "//input[@id='mat-input-5']")
	WebElement mobileNumber;

	// Alternative number
	@FindBy(xpath = "//input[@id='mat-input-6']")
	WebElement AlternativeNumber;

	// Email
	@FindBy(xpath = "//input[@id='mat-input-7']")
	WebElement Email;

	// User name
	@FindBy(xpath = "//input[@id='mat-input-8']")
	WebElement userName;

	// Official Mail id
	@FindBy(xpath = "//input[@id='mat-input-9']")
	WebElement OfficialMailId;

	// DateOfbirth
	@FindBy(xpath = "//*[@class='mat-form-field-suffix ng-tns-c86-60 ng-star-inserted']")
	WebElement DateOfbirth;

	// BloodGroup
	@FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c88-62']")
	WebElement Bloodgroup;

	// Gender
	@FindBy(xpath = "//label[@for='mat-radio-2-input']//div[@class='mat-radio-label-content']")
	WebElement Gender;

	// aadhar
	@FindBy(xpath = "//input[@id='mat-input-11']")
	WebElement aadhar;

	// Pancard
	@FindBy(xpath = "//input[@id='mat-input-12']")
	WebElement Pancard;

	// Aadhar votercard
	@FindBy(xpath = "//input[@id='mat-input-13']")
	WebElement Votercard;

	// Passport
	@FindBy(xpath = "//input[@id='mat-input-14']")
	WebElement Passport;

	// Marital Status
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper ng-tns-c88-68']")
	WebElement marritalStatus;
}
