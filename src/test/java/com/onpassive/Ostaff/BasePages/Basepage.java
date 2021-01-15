package com.onpassive.Ostaff.BasePages;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.onpassive.Ostaff.Pages.Company;
import com.onpassive.Ostaff.Pages.HomePage;
import com.onpassive.Ostaff.Pages.TimeSchedule;
import com.onpassive.Ostaff.Utility.CommonLibrary;
import com.onpassive.Ostaff.Utility.FileLibrary;

import Log4j.Log4jdemo;

public class Basepage implements ConstantValues {

	protected static WebDriver driver;
	protected HomePage hm;
	protected static FileLibrary fl = new FileLibrary();
	static Logger logger = LogManager.getLogger(Log4jdemo.class);
	protected CommonLibrary cl;
	protected TimeSchedule ts;
	protected Company comp;
	

	@BeforeTest
	@Parameters("Browser")
	public void launchingbrowser(String browser) throws Exception {

		String browser1 = fl.getPropKeyvalue(PROP_PATH, "browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();
		}

		logger.info("Initializing the " + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get(fl.getPropKeyvalue(PROP_PATH, "url"));
		driver.get(fl.getCellData(LOGIN_EXCEL, "Sheet1", 0, 6));
		hm = new HomePage(driver);
		cl = new CommonLibrary();
		ts = new TimeSchedule(driver);
		comp = new Company(driver);
	}

	@AfterTest
	@Parameters("Browser")
	public void tearDown(String browser) throws Exception {
		String browser1 = fl.getPropKeyvalue(PROP_PATH, "browser");
		Thread.sleep(1000);
		driver.close();
		logger.info("Closed the " +browser+" browser");
	}
}
