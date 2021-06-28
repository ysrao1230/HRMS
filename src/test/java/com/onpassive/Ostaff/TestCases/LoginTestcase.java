package com.onpassive.Ostaff.TestCases;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Pages.LoginPage;
import com.onpassive.Ostaff.Utility.CapturingFailedCases;

import Log4j.Log4jdemo;

@Listeners(CapturingFailedCases.class)
public class LoginTestcase extends Basepage {

	LoginPage login;
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test(priority = 0, enabled = true)
	public void logintoApplication() throws Exception {
		/*
		 * ExtentHtmlReporter report = new ExtentHtmlReporter(
		 * "C:\\Users\\pc\\Documents\\GitHub\\HRMS\\ExtentReport\\login1.html");
		 * ExtentReports extent = new ExtentReports(); extent.attachReporter(report);
		 * ExtentTest extentlogger = extent.createTest("Login Test case");
		 * extentlogger.log(Status.INFO, "Login to Ostaff Application");
		 * extentlogger.log(Status.PASS, "Login to Ostaff Application");
		 * 
		 * extent.flush();
		 */

		login = new LoginPage(driver);
		System.out.println("THe execution starts from the: " + cl.getCurrentDateTime());
		String uname = fl.getCellData(LOGIN_EXCEL, "Sheet1", 0, 0);
		login.uname(uname);
		/*
		 * ExtentTest extentlogger2 = extent.createTest("Login Test case");
		 * extentlogger2.log(Status.FAIL, "Login to Ostaff Application");
		 * extentlogger2.addScreenCaptureFromPath("Screenshot.png"); extent.flush();
		 */
		String pwd = fl.getCellData(LOGIN_EXCEL, "Sheet1", 0, 1);
		login.pasword(pwd);
		Thread.sleep(2000);
		login.showpsd();

		login.login();
		String str = cl.getPageTitle();
		System.out.println("Current Page title is: " + str);
		// assertEquals("OnPassive HRMS", str);
		assertEquals("O-Staff The Next Gen HR Management Software", str);
		logger.info("Logged in to allpication successfully");
		Assert.assertFalse(false, "Assert false test message");
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Fail");
		Assert.assertTrue(true, hm.dashBoard());
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Pass");
		System.out.println("Writting Done");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links on webpage: " + links.size());

		List<WebElement> img = driver.findElements(By.tagName("img"));

		System.out.println("Image count is: " + img.size());

		List<WebElement> btn = driver.findElements(By.tagName("Button"));

		System.out.println("Btn count is: " + btn.size());

		List<WebElement> input = driver.findElements(By.tagName("input"));
		System.out.println("input count is: " + input.size());

		HttpURLConnection conn = null;

		for (WebElement elm : links) {
			String url = elm.getAttribute("href");

			System.out.println();
			if (url != null && !url.contains("javascript")) {
				conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setConnectTimeout(3000);
				if (conn.getResponseCode() >= 400) {
					String strs = url + " - " + conn.getResponseMessage() + "Link is not working";
					System.out.println(url + " - " + conn.getResponseMessage() + "Link is not working");
					// listNotWorkingUrls.add(strs);
					// sm.outPut(linkUrl + " - " + httpURLConnect.getResponseMessage() + "Link is
					// not working");
				}

				// Fetching and Printing the response code obtained
				else {
					String str2 = url + " - " + conn.getResponseMessage();
					System.out.println(url + " -- " + str2);
					// sm.outPut(linkUrl + " - " + httpURLConnect.getResponseMessage());

					// listWorkingUrls.add(str);

				}

			}
		}

	}

	@Test(groups = { "smoke" }, priority = 15, enabled = true, dependsOnMethods = "logintoApplication")
	public void logout() throws InterruptedException {
		hm.logoutoption();
		logger.info("Logged out of the application successfully");
		Assert.assertEquals(true, false);

	}

	@Test(priority = 1, enabled = true, dependsOnMethods = "logintoApplication")
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
		hm.Hroperationaction();
		hm.selectLocation();
		Thread.sleep(2000);
		logger.info("Performing the HR operations for location");

	}

	@Test(priority = 4, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationCompany() throws Exception {
		hm.Hroperationaction();
		hm.SelectCompany();
		logger.info("Performing the HR operations for company");

	}

	@Test(priority = 14, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationAsset() throws Exception {
		hm.Hroperationaction();
		hm.SelectAssets();
		logger.info("Performing the HR operations for assets");

	}

	@Test(priority = 5, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationDepartment() throws Exception {
		hm.Hroperationaction();
		hm.SelectDepartment();
		logger.info("Performing the HR operations for Department");

	}

	@Test(priority = 6, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationDesignation() throws Exception {
		hm.Hroperationaction();
		hm.SelectDesignation();
		logger.info("Performing the HR operations for designation");

	}

	@Test(priority = 8, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationnotification() throws Exception {
		hm.Hroperationaction();
		hm.SelectNotfication();
		logger.info("Performing the HR operations for notification");

	}

	@Test(priority = 9, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationProject() throws Exception {
		hm.Hroperationaction();
		hm.SelectProject();
		logger.info("Performing the HR operations for project");

	}

	@Test(priority = 10, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationHolidaysList() throws Exception {
		hm.Hroperationaction();
		hm.SelectHolidays();
		logger.info("Performing the HR operations for holidays");

	}

	@Test(priority = 11, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationjobs() throws Exception {
		hm.Hroperationaction();
		hm.SelectJobs();
		logger.info("Performing the HR operations for jobs");

	}

	@Test(priority = 13, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationpolicy() throws Exception {
		hm.Hroperationaction();
		hm.SelectPolicy();
		logger.info("Performing the HR operations for policy");

	}

	@Test(priority = 7, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationLeavePlan() throws Exception {
		hm.Hroperationaction();
		hm.SelectLeaveplan();
		logger.info("Performing the HR operations for leave plan");

	}

	@Test(priority = 12, enabled = false, dependsOnMethods = "logintoApplication")
	public void hrOperationSkils() throws Exception {
		hm.Hroperationaction();
		hm.SelectSkills();
		logger.info("Performing the HR operations for skills");

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "logintoApplication")
	public void companyoptionselection() throws Exception {
		comp.Hroperationaction();
		comp.SelectCompany();
		System.out.println(comp.getText());
		logger.info("Performing the HR operations for company");
	}

	@Test(priority = 5, enabled = false, dependsOnMethods = "logintoApplication")
	public void addingnewCompany() {
		comp.addingNewCompany();
	}

	@Test(priority = 6, enabled = false, dependsOnMethods = "logintoApplication")
	public void companyformsubmission() throws Exception {
		comp.SetCompanyName(fl.getCellData(FORMS_DATA, "Sheet1", 1, 2));

		comp.SetCompanyContact(fl.getCellData(FORMS_DATA, "Sheet1", 2, 2));

		comp.SetCompanyEmail(fl.getCellData(FORMS_DATA, "Sheet1", 3, 2));

		comp.SetCompanyWebsite(fl.getCellData(FORMS_DATA, "Sheet1", 4, 2));

		comp.Setaddress(fl.getCellData(FORMS_DATA, "Sheet1", 5, 2));

		comp.SetCity(fl.getCellData(FORMS_DATA, "Sheet1", 6, 2));

		comp.SetStreet(fl.getCellData(FORMS_DATA, "Sheet1", 7, 2));

		comp.SetLandmark(fl.getCellData(FORMS_DATA, "Sheet1", 8, 2));

		comp.SetDistrict(fl.getCellData(FORMS_DATA, "Sheet1", 9, 2));

		comp.SetState(fl.getCellData(FORMS_DATA, "Sheet1", 10, 2));

		comp.SetCountry(fl.getCellData(FORMS_DATA, "Sheet1", 11, 2));

		comp.SetPincode(fl.getCellData(FORMS_DATA, "Sheet1", 12, 2));

		comp.saveCompany();
		Thread.sleep(4000);
	}

	@Test(priority = 7, enabled = true, dependsOnMethods = "logintoApplication")
	public void companySearchoption() {
		comp.searchdata("Shiftwave");

	}

}
