package com.onpassive.Ostaff.BasePages;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.onpassive.Ostaff.Pages.HomePage;
import com.onpassive.Ostaff.Utility.CommonLibrary;
import com.onpassive.Ostaff.Utility.FileLibrary;

import Log4j.Log4jdemo;

public class Basepage implements ConstantValues {

	protected static WebDriver driver;
	protected HomePage hm;
	protected static FileLibrary fl = new FileLibrary();
	static Logger logger = LogManager.getLogger(Log4jdemo.class);
	protected CommonLibrary cl;
	

	@BeforeTest
	public void launchingbrowser() throws Exception {

		String browserValue = fl.getPropKeyvalue(PROP_PATH, "browser");

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("firefox")) {

			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver = new FirefoxDriver();
			logger.info("Intializing browser");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(fl.getPropKeyvalue(PROP_PATH, "url"));
		hm = new HomePage(driver);
		cl = new CommonLibrary();
		

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		logger.info("Closed the browser");
	}
}
