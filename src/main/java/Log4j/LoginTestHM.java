package Log4j;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHM {

	// method return HashMap object with data pairs
	static HashMap<String, String> logindata() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("x", "sathish admin@123");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");

		return hm;

	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://hrmsdemo.onpassive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login as X
		String credentials = logindata().get("x"); // Retriving value 'x' from
		// HashMap

		// Login as y
		// String credentials = logindata().get("y");

		// Login as z
		// String credentials = logindata().get("x");

		String uarr[] = credentials.split(" "); // separting value of 'x' into
		// 2 parts using delimeter '@'

		driver.findElement(By.id("mat-input-0")).sendKeys(uarr[0]); // Passing
		// value 1
		// i.e
		// username
		// from
		// array
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(uarr[1]); // Passing
		// value 2
		// i.e
		// password
		// from
		// array
		driver.findElement(By.xpath("//*[text()='Login Here']")).click();

		// Validation
		if (driver.getTitle().equals("OStaff")) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test failed");

		}

		WebElement elem = driver.findElement(By.xpath("//div[@aria-label='User Signed In successfully']"));
		System.out.println("Displayed sign in message : " + elem.getText());
		Thread.sleep(3000);
		driver.quit();

		// Data formater for the excel sheet data
		Workbook wb = WorkbookFactory.create(new File("input.xlsx"));
		DataFormatter formatter = new DataFormatter();
		org.apache.poi.ss.usermodel.Sheet s = wb.getSheetAt(0);
		for (Row r : s) {
			for (Cell c : r) {
				System.out.println(formatter.formatCellValue(c));
			}
		}

	}
}
