package com.onpassive.Ostaff.Utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.onpassive.Ostaff.BasePages.Basepage;

public class CommonLibrary extends Basepage {
	public void waitForElementVisibility(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void explicit_Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void scrollPage(WebElement element) throws Exception {
		Point pt = element.getLocation();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy" + pt);
		Thread.sleep(2000);
	}

	public void javaScriptClick(WebElement element) {
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		jsexecutor.executeScript("arguments[0].click();", element);
	}

	public void select(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void select(String value, WebElement element) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void select(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void mouseHover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	public void verifyPage(String actPage, String expPage, String pageName) {
		Assert.assertEquals(actPage, expPage);
		Reporter.log(pageName + " is displayed  -->> pass", true);
	}

	public void elementDispayed(WebElement element, String elementName) {
		System.out.println(element.isDisplayed());
		Assert.assertTrue(element.isDisplayed());
		Reporter.log(elementName + "is Displayed -->>", true);
	}

	public static String captureScreenShots() {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshot = System.getProperty("user.dir") + "/Screenshots/Webinair_" + getCurrentDateTime() + ".png";
		try {
			File destination = new File(screenshot);
			FileUtils.copyFile(file, destination);
			System.out.println("screenshot captured");
		} catch (Exception e) {
			System.out.println("unable to capture screenshot >>" + e.getMessage());
		}
		return screenshot;
	}

	public static String getCurrentDateTime() {
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date cdate = new Date();
		return customformat.format(cdate);
	}

	public WebElement sidebarscrolling(WebElement elem) throws Exception {
		// Create instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;
		// now execute query which actually will scroll until that element is not
		// appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);", elem);
		// Extract the text and verify
		System.out.println(elem.getText());
		return elem;
	}
	
	public WebElement clickAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		return element;
		
	}

}
