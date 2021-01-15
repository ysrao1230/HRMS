package Log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class childWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		// Open new child window within the main window
		WebElement elem = driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));

		for (int i = 0; i < 3; i++) {
			elem.click();
			Thread.sleep(5000);

		}

		// Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main window is: " + mainWindowHandle);
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				System.out.println("Child window is: " + ChildWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is " + text.getText());
				System.out.println("Navigating to google.com");
				driver.get("https://google.com");
				Thread.sleep(4000);
			}
		}
		System.out.println("Switching to the main window after all child operation performance");
		driver.switchTo().window(mainWindowHandle);
		System.out.println(driver.findElement(By.xpath("//div[@class='main-header']")).getText());
		Thread.sleep(3000);
		driver.quit();

		// Make a collection
		System.out.println("***********ITERATION OF DATA************");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Mazda");
		System.out.println(" ");
		// Get the iterator
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		System.out.println(" ");
		// Print the first item
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Array List
		System.out.println("***********ARRAY LIST DATA************");
		ArrayList<String> carz = new ArrayList<String>();
		carz.add("Benz");
		carz.add("Audi");
		carz.add("Swift");
		carz.add("Q5");
		for (String i : carz) {
			System.out.println(i);
		}
	}

}
