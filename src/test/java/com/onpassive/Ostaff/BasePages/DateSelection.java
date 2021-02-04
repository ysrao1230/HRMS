package com.onpassive.Ostaff.BasePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateSelection implements ConstantValues {

	WebDriver driver;

	@BeforeTest
	public WebDriver launchingChrome() {
		// System.setProperty(CHROME_KEY, CHROME_PATH);
		// driver = new ChromeDriver();

		System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	@Test
	public void dateSelection() throws InterruptedException {
		driver.get("http://hrmsdemo.onpassive.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("mat-input-0")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[text()='visibility_off']")).click();

		driver.findElement(By.xpath("//*[text()='Login Here']")).click();

		// Selecting Employee onboarding option
		driver.findElement(By.xpath("//p[normalize-space()='Employee Onboarding']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='create_new']//div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[1]"))
				.click();

		driver.findElement(By.xpath("//td[@aria-label='Feb 4, 2021']")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");
		WebElement address = driver.findElement(By.xpath("//mat-step-header[@id='cdk-step-label-0-1']"));
		js.executeScript("arguments[0].click()", address);
		System.out.printf("Element: " + address + " has beed clicked, Selenium exception triggered");
		Thread.sleep(4000);
		/*
		 * address.click();
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 */
		WebElement educationdata = driver.findElement(By.xpath("//mat-step-header[@id='cdk-step-label-0-2']"));
		js.executeScript("arguments[0].click()", educationdata);

		Thread.sleep(4000);

		WebElement professionalDetails = driver.findElement(By.xpath("//div[contains(text(),'Professional Details')]"));
		js.executeScript("arguments[0].click()", professionalDetails);
		Thread.sleep(4000);

		WebElement personalDetails = driver.findElement(By.xpath("//div[contains(text(),'Personal Details')]"));
		js.executeScript("arguments[0].click()", personalDetails);
		Thread.sleep(4000);

		WebElement emergencyContact = driver
				.findElement(By.xpath("//div[contains(text(),'Emergency Contact Details')]"));
		js.executeScript("arguments[0].click()", emergencyContact);
		Thread.sleep(4000);

		WebElement roleAndDepartment = driver.findElement(By.xpath("//div[contains(text(),'Role & Department')]"));
		js.executeScript("arguments[0].click()", roleAndDepartment);
		Thread.sleep(4000);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		js.executeScript("arguments[0].click()", submit);

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(18000);
		driver.close();
	}
}
