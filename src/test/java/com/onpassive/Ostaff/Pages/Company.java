package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Utility.CommonLibrary;

public class Company extends Basepage {

	CommonLibrary comnlib = new CommonLibrary();
	public static WebDriver driver;

	// Webelement of Company
	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;

	// Add company
	@FindBy(xpath = "//i[@class='fa fa-plus action_ico']")
	WebElement addCompany;

	// Compnay Name
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Company Name']")
	WebElement CompanyName;

	// CompanyContact
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Contact']")
	WebElement CompanyContact;

	// Company Emial
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Email']")
	WebElement CompanyEmail;

	// Company Website
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Website']")
	WebElement CompanyWebsite;
	
	//Company address
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Address']")
	WebElement address;
	
	//Company City	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='City']")
	WebElement CompanyCity;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Street']")
	WebElement CompanyStreet;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Landmark']")
	WebElement Companylandmark;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='District']")
	WebElement Companydistrict;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='State']")
	WebElement CompanyState;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder='Country']")
	WebElement CompanyCountry;
	
	@FindBy(xpath = "//*[@ng-reflect-name='pincode']")
	WebElement CompanyPin;

	@FindBy(xpath = "//span[@class='ng-star-inserted'and text()='Company']")
	WebElement companyText;
	
	// Webelement of HR operation
	@FindBy(xpath = "//p[normalize-space()='HR Operations']")
	WebElement hroperation;
	
	@FindBy(xpath="//*[@class='btn save']")
	WebElement CompanyFormSave;
	
	//Search option
	@FindBy(xpath = "//input[@ng-reflect-name='searchKey']")
	WebElement Searchoption;
	
	public void searchdata(String input) {
		Searchoption.sendKeys(input);
		String expected = null;
		//td[normalize-space()='Shiftwave']
		Assert.assertEquals(input, expected);
	}

	public void SelectCompany() throws Exception {
		comnlib.sidebarscrolling(Company);
		comnlib.clickAction(Company);
		System.out.println("Company Call");
	}

	public Company(WebDriver driver) {
		Basepage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getText() {
		System.out.println("Current Page title is: "+comnlib.getPageTitle());
		return companyText.getText();
	}
	
	public void addingNewCompany() {
		addCompany.click();
	}
	
	public void SetCompanyName(String value) {
		System.out.println(value);	
		try {
			CompanyName.sendKeys(value);
			String name=CompanyName.getAttribute("value");
			System.out.println("Company Name: " +name.toUpperCase());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetCompanyContact(String value) {
		System.out.println(value);	
		try {
			CompanyContact.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetCompanyEmail(String value) {
		System.out.println(value);	
		try {
			CompanyEmail.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetCompanyWebsite(String value) {
		System.out.println(value);	
		try {
			CompanyWebsite.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void Setaddress(String value) {
		System.out.println(value);	
		try {
			address.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetCity(String value) {
		System.out.println(value);	
		try {
			CompanyCity.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetStreet(String value) {
		System.out.println(value);	
		try {
			CompanyStreet.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void SetLandmark(String value) {
		System.out.println(value);	
		try {
			Companylandmark.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void SetDistrict(String value) {
		System.out.println(value);	
		try {
			Companydistrict.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void SetState(String value) {
		System.out.println(value);	
		try {
			CompanyState.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void SetCountry(String value) {
		System.out.println(value);	
		try {
			CompanyCountry.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void SetPincode(String value) {
		System.out.println(value);	
		try {
			CompanyPin.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void Hroperationaction() throws Exception {
		comnlib.sidebarscrolling(hroperation);
		comnlib.clickAction(hroperation);
	}
	
	public void saveCompany() throws Exception {
		comnlib.scrollPage(CompanyFormSave);
		CompanyFormSave.click();

	}

}
