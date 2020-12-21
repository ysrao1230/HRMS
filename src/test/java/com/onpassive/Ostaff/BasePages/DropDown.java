package com.onpassive.Ostaff.BasePages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.onpassive.Ostaff.Utility.FileLibrary;

public class DropDown implements ConstantValues {

	static WebDriver driver;

	public WebElement sidebarscrolling(WebElement elem) throws Exception {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elem);
		return elem;
	}

	public WebElement clickAction(WebElement element) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		Thread.sleep(2000);
		return element;
	}

	public static void main(String[] args) throws Exception {
		DropDown dr = new DropDown();
		// TODO Auto-generated method stub
		FileLibrary fl = new FileLibrary();

		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get(fl.getPropKeyvalue(PROP_PATH, "url"));

		driver.findElement(By.id("mat-input-0")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[text()='Login Here']")).click();

		WebElement hroperation = driver.findElement(By.xpath("//p[normalize-space()='HR Operations']"));

		dr.sidebarscrolling(hroperation);
		dr.clickAction(hroperation);

		WebElement location = driver.findElement(By.cssSelector("#location > div:nth-child(1) > p"));
		dr.clickAction(location);

		driver.findElement(By.xpath("//div[@class='create_new']//div")).click();

		WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/app-user-layout/div/"
				+ "div[2]/div/div[1]/app-create-branch/div/div[2]/div/form/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]"));
				dropdown.click();
				
				driver.findElement(By.xpath("//*[@id='mat-option-5']")).click();
		/*
		 * Select selct = new Select(dropdown); selct.selectByIndex(2);
		 */
	}

}
