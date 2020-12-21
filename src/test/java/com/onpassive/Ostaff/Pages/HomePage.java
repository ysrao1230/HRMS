package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Utility.CommonLibrary;

public class HomePage extends Basepage {

	WebDriver driver;

	// common library object creation
	CommonLibrary cli = new CommonLibrary();

	// Webelement of logout menu
	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	WebElement logoutmenu;

	// Webelement of logout
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement logout;

	// Webelement of dashboard
	@FindBy(xpath = "//p[normalize-space()='Dashboard']")
	WebElement dashboard;

	// Webelement of HR operation
	@FindBy(xpath = "//p[normalize-space()='HR Operations']")
	WebElement hroperation;

	// Webelement of time schedule
	@FindBy(xpath = "//p[normalize-space()='Timing Schedule']")
	WebElement TimeSchedule;

	// Webelement of adding time schedule
	@FindBy(xpath = "//div[@class='create_new']")
	WebElement addingTimeschedule;

	// Webelement of Location
	@FindBy(css = "#location > div:nth-child(1) > p")
	WebElement Location;

	// Webelement of Company
	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;

	// Webelement of Department
	@FindBy(xpath = "//p[normalize-space()='Department']")
	WebElement Department;

	// Webelement of designation
	@FindBy(xpath = "//a[@id='designation']//div[@class='side-navicon']")
	WebElement Designation;

	// Webelement of leave plan
	@FindBy(xpath = "//p[normalize-space()='Leave Plan']")
	WebElement LeavePlan;

	// Webelement of notification
	@FindBy(xpath = "//p[normalize-space()='Notification']")
	WebElement Notification;

	// Webelement of project
	@FindBy(xpath = "//p[normalize-space()='Project']")
	WebElement Project;

	// Webelement of holidays
	@FindBy(xpath = "//p[normalize-space()='Holiday List']")
	WebElement Holidayslist;

	// Webelement of jobs
	@FindBy(xpath = "//p[normalize-space()='Jobs']")
	WebElement jobs;

	// Webelement of skills
	@FindBy(xpath = "//a[@id='skills']//div[@class='mat-list-item-content']")
	WebElement skills;

	// Webelement of policy
	@FindBy(xpath = "//p[normalize-space()='Policy']")
	WebElement policy;

	// Webelement of assets
	@FindBy(xpath = "//p[normalize-space()='Assets']")
	WebElement Assets;

	// Dashboard Text
	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	WebElement dashBoardText;

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

	public void Hroperationmove() {
		Actions action = new Actions(driver);
		action.moveToElement(hroperation).perform();
	}

	public void Hroperationaction() throws Exception {
		cli.sidebarscrolling(hroperation);
		cli.clickAction(hroperation);
	}

	public void TimeSchedule() throws Exception {
		cli.sidebarscrolling(TimeSchedule);
		cli.clickAction(TimeSchedule);
	}

	public void addingtimeScheduling() {
		addingTimeschedule.click();
		addingTimeschedule.click();
	}

	public void selectLocation() throws Exception {
		cli.sidebarscrolling(Location);
		cli.clickAction(Location);
	}

	public void SelectCompany() throws Exception {
		cli.sidebarscrolling(Company);
		cli.clickAction(Company);
	}

	public void SelectDepartment() throws Exception {
		cli.sidebarscrolling(Department);
		cli.clickAction(Department);
	}

	public void SelectDesignation() throws Exception {
		cli.sidebarscrolling(Designation);
		cli.clickAction(Designation);
	}

	public void SelectLeaveplan() throws Exception {
		cli.sidebarscrolling(LeavePlan);
		cli.clickAction(LeavePlan);
	}

	public void SelectNotfication() throws Exception {
		cli.sidebarscrolling(Notification);
		cli.clickAction(Notification);
	}

	public void SelectProject() throws Exception {
		cli.sidebarscrolling(Project);
		cli.clickAction(Project);
	}

	public void SelectHolidays() throws Exception {
		cli.sidebarscrolling(Holidayslist);
		cli.clickAction(Holidayslist);
	}

	public void SelectJobs() throws Exception {
		cli.sidebarscrolling(jobs);
		cli.clickAction(jobs);
	}

	public void SelectSkills() throws Exception {
		cli.sidebarscrolling(skills);
		cli.clickAction(skills);
	}

	public void SelectPolicy() throws Exception {
		cli.sidebarscrolling(policy);
		cli.clickAction(policy);
	}

	public void SelectAssets() throws Exception {
		cli.sidebarscrolling(Assets);
		cli.clickAction(Assets);
	}

	public String dashBoard() {
		return dashBoardText.getText();
	}

}
