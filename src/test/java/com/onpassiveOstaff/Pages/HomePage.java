package com.onpassiveOstaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassiveOstaff.BasePages.Basepage;

public class HomePage extends Basepage {

	WebDriver driver;

	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	WebElement logoutmenu;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement logout;

	@FindBy(xpath = "//*[@id='sideMenuBar']/app-side-nav/div/div/mat-nav-list[1]/a/div/img")
	WebElement dashboard;

	@FindBy(xpath = "//*[@id=\"sideMenuBar\"]/app-side-nav/div/div/mat-nav-list[2]/a/div/div[3]/p")
	WebElement hroperation;
	
	@FindBy(xpath="//p[normalize-space()='Timing Schedule']")
	WebElement TimeSchedule;

	@FindBy(xpath="//i[@class='fa fa-plus action_ico']")
	WebElement addingTimeschedule;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logoutoption() throws InterruptedException {
		logoutmenu.click();
		Thread.sleep(3000);
		logout.click();
	}

	public void dashboardclick() {
		dashboard.click();
	}

	public void Hroperationaction() {
		Actions action = new Actions(driver);
		action.moveToElement(hroperation).click().perform();
	}
	
	public void TimeSchedule() {
		Actions action = new Actions(driver);
		action.moveToElement(TimeSchedule).click().perform();
	}
	
	public void addingtimeScheduling() {
		addingTimeschedule.click();
	}
}
