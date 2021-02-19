package com.onpassive.Ostaff.TestCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Pages.LoginPage;

import Log4j.Log4jdemo;

public class LoginTestcase extends Basepage {

	LoginPage login;
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test(priority = 0, enabled = true)
	public void logintoApplication() throws Exception {
		ExtentHtmlReporter report = new ExtentHtmlReporter(
				"C:\\Users\\pc\\Documents\\GitHub\\HRMS\\ExtentReport\\login1.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		ExtentTest extentlogger = extent.createTest("Login Test case");
		extentlogger.log(Status.INFO, "Login to Ostaff Application");
		extentlogger.log(Status.PASS, "Login to Ostaff Application");

		extent.flush();

		logger.info("page loading info");
		login = new LoginPage(driver);
		logger.info("Trying to login to the application without any errors");
		String uname = fl.getCellData(LOGIN_EXCEL, "Sheet1", 1, 0);
		login.uname(uname);
		ExtentTest extentlogger2 = extent.createTest("Login Test case");
		extentlogger2.log(Status.FAIL, "Login to Ostaff Application");
		extentlogger2.addScreenCaptureFromPath("Screenshot.png");
		extent.flush();
		String pwd = fl.getCellData(LOGIN_EXCEL, "Sheet1", 1, 1);
		login.pasword(pwd);
		Thread.sleep(2000);
		login.showpsd();
		System.out.println("THe execution starts for the: " + cl.getCurrentDateTime());
		login.login();
		String str = cl.getPageTitle();
		System.out.println("Current Page title is: " + str);
		// assertEquals("OnPassive HRMS", str);
		assertEquals("OStaff", str);
		logger.info("Logged in to allpication successfully");
		Assert.assertFalse(false, "Assert false test message");
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Fail");
		Assert.assertTrue(true, hm.dashBoard());
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Pass");
		System.out.println("Writting Done");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links on webpage: " + links.size());

		for (WebElement elm : links) {
			System.out.println(elm.getAttribute("href"));
		}

	}

	@Test(groups = { "smoke" }, priority = 15, enabled = true, dependsOnMethods = "logintoApplication")
	public void logout() throws InterruptedException {
		hm.logoutoption();
		logger.info("Logged out of the application successfully");
	}

	@Test(priority = 1, enabled = false, dependsOnMethods = "logintoApplication")
	public void dashboardOperations() throws InterruptedException {
		hm.dashboardclick();
		Thread.sleep(2000);
		logger.info("Clicking dashboard option");
	}

	@Test(priority = 2, enabled = false, dependsOnMethods = "logintoApplication")
	public void HroperationsTimeschedule() throws Exception {
		hm.Hroperationaction();
		logger.info("Performing the HR operations");
		hm.TimeSchedule();
		logger.info("Performing the Time scheduling");
		hm.addingtimeScheduling();
		logger.info("Adding the time scheduling");
		Thread.sleep(2000);
		/*
		 * ts.companyDropdownSelection(); logger.info("Company drop down selection");
		 * ts.companydropdownlistselection(); logger.info("Company info Selected");
		 * ts.branchSelection(); logger.info("branch drop down selection");
		 * ts.branchlistselection(); logger.info("Branch selected from  list");
		 */
	}

	@Test(priority = 3, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationLocation() throws Exception {
		hm.Hroperationmove();
		hm.selectLocation();
		logger.info("Performing the HR operations for location");

	}

	/*
	 * @Test(priority = 4, enabled = false, dependsOnMethods = "logintoApplication")
	 * public void hrOperationCompany() throws Exception { hm.Hroperationmove();
	 * hm.SelectCompany(); logger.info("Performing the HR operations for company");
	 * 
	 * }
	 */

	@Test(priority = 14, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationAsset() throws Exception {
		hm.SelectAssets();
		logger.info("Performing the HR operations for assets");

	}

	@Test(priority = 5, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationDepartment() throws Exception {
		hm.Hroperationmove();
		hm.SelectDepartment();
		logger.info("Performing the HR operations for Department");

	}

	@Test(priority = 6, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationDesignation() throws Exception {
		hm.Hroperationmove();
		hm.SelectDesignation();
		logger.info("Performing the HR operations for designation");

	}

	@Test(priority = 8, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationnotification() throws Exception {
		hm.Hroperationmove();
		hm.SelectNotfication();
		logger.info("Performing the HR operations for notification");

	}

	@Test(priority = 9, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationProject() throws Exception {
		hm.Hroperationmove();
		hm.SelectProject();
		logger.info("Performing the HR operations for project");

	}

	@Test(priority = 10, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationHolidaysList() throws Exception {
		hm.Hroperationmove();
		hm.SelectHolidays();
		logger.info("Performing the HR operations for holidays");

	}

	@Test(priority = 11, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationjobs() throws Exception {
		hm.Hroperationmove();
		hm.SelectJobs();
		logger.info("Performing the HR operations for jobs");

	}

	@Test(priority = 13, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationpolicy() throws Exception {
		hm.Hroperationmove();
		hm.SelectPolicy();
		logger.info("Performing the HR operations for policy");

	}

	@Test(priority = 7, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationLeavePlan() throws Exception {
		hm.Hroperationmove();
		hm.SelectLeaveplan();
		logger.info("Performing the HR operations for leave plan");

	}

	@Test(priority = 12, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationSkils() throws Exception {
		hm.Hroperationmove();
		hm.SelectSkills();
		logger.info("Performing the HR operations for skills");

	}
}
