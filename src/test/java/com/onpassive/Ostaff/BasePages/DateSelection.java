package com.onpassive.Ostaff.BasePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
	}

	@Test
	public void dateSelection() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://ostaffuidev.onpassive.com");
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

		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='First Name']")).sendKeys("Srinivasa Rao");
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='Last Name']")).sendKeys("Yamalapalli");
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='Mobile']")).sendKeys("9052880660");
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='Email']")).sendKeys("SrinivasaRao@gmail.com");
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='User Name']")).sendKeys("SrinivasaRao1122");
		/*
		 * js.executeScript("window.scrollBy(0,100)"); driver.findElement(By.
		 * xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[2]"
		 * )) .click();
		 * 
		 * driver.findElement(By.xpath("//td[@aria-label='Feb 4, 2021']")).click()
		 * driver.findElement(By.xpath(
		 * "//label[@for='mat-radio-2-input']//div[@class='mat-radio-container']")).
		 * click();;
		 */
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='Aadhar Card']")).sendKeys("123456789123");
		driver.findElement(By.xpath("//*[@ng-reflect-placeholder='PAN Card']")).sendKeys("AGWZP4125P");
		Thread.sleep(2000);

		// js.executeScript("window.scrollBy(0,1000)");
		WebElement address = driver.findElement(By.xpath("//mat-step-header[@id='cdk-step-label-0-1']"));
		js.executeScript("arguments[0].click()", address);

		js.executeScript("window.scrollBy(0,-200)");
		driver.findElement(By.xpath("//input[@id='mat-input-18']")).sendKeys("Testing address");
		// input[@id='mat-input-18']
		Thread.sleep(2000);
		System.out.println("Data enetered into the text box");
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();

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
		Thread.sleep(3000);

		WebElement roleAndDepartment = driver.findElement(By.xpath("//div[contains(text(),'Role & Department')]"));
		js.executeScript("arguments[0].click()", roleAndDepartment);
		Thread.sleep(4000);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		js.executeScript("arguments[0].click()", submit);

		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//button[@class='btn cancel']"));
		js.executeScript("arguments[0].click()", close);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(18000);
		driver.close();
	}
}
