package com.onpassive.Ostaff.BasePages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;


public class B {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		B b = new B();
		/*
		 * List<WebElement> allelement = driver.findElements(By.
		 * xpath("//*[@class='mat-option mat-focus-indicator ng-tns-c392-626 ng-star-inserted']"
		 * )); for(WebElement ele:allelement) {
		 * if(ele.getText().equalsIgnoreCase("onp")) { ele.click(); } }
		 */
		/*
		 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS);
		 */

		/*
		 * driver.get("https://hrmsdemo.onpassive.com/dashboard");
		 * 
		 * driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("sathish"
		 * ); driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(
		 * "admin@123"); //
		 * driver.findElement(By.xpath("//*[text()='visibility_off']")).click();
		 * driver.findElement(By.xpath("//*[text()='Login Here']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println("Number of links on webpage: " + links.size());
		 * 
		 * for (WebElement elm : links) { String element = elm.getAttribute("href");
		 * System.out.println(element); elm.click(); System.out.println(element +
		 * " has been clicked"); }
		 * 
		 * Thread.sleep(5000); driver.quit();
		 */

		/*
		 * driver.get("http:www.google.com"); List<WebElement> links =
		 * driver.findElements(By.tagName("a")); System.out.println("no of links:" +
		 * links.size());
		 * 
		 * for (int i = 0; i < links.size(); i++) {
		 * System.out.println(links.get(i).getAttribute("href")); if
		 * (!(links.get(i).getText().isEmpty())) { links.get(i).click();
		 * driver.navigate().back(); links = driver.findElements(By.tagName("a")); } }
		 * Thread.sleep(5000); driver.quit();
		 */

		String str = "Hi how are you welcome to Tutorialspoint";
		String words[] = str.split(" ");
		for (String token : words) {
			System.out.println(token);
			int len = token.length();
			/*
			 * for (int j = len - 1; j >= 0; j--) { rev = rev + token.charAt(j);
			 * 
			 * } System.out.println(rev);
			 */
		}
		// Finding the largest number
		int num1 = 10, num2 = 20, num3 = 7;

		if (num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is the largest Number");

		else if (num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the largest Number");

		else
			System.out.println(num3 + " is the largest Number");

		b.calculate(2000, 5, 0.08, 12);
		b.duplicateCharOfString("srinivasa rao");

	}

	public void calculate(int p, int t, double r, int n) {
		double amount = p * Math.pow(1 + (r / n), n * t);
		double cinterest = amount - p;
		System.out.println("Compound Interest after " + t + " years: " + cinterest);
		System.out.println("Amount after " + t + " years: " + amount);
	}
	
	public void duplicateCharOfString(String str) {
		// Creating a HashMap containing char 
        // as a key and occurrences as a value 
        Map<Character, Integer> map 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string into 
        // a char array 
        char[] charArray = str.toCharArray(); 
  
        // Checking each character 
        // of charArray 
        for (char c : charArray) { 
  
            if (map.containsKey(c)) { 
  
                // If character is present 
                // in map incrementing it's 
                // count by 1 
                map.put(c, map.get(c) + 1); 
            } 
            else { 
  
                // If character is not present 
                // in map putting this 
                // character into map with 
                // 1 as it's value. 
                map.put(c, 1); 
            } 
        } 
  
        // Traverse the HashMap, check 
        // if the count of the character 
        // is greater than 1 then print 
        // the character and its frequency 
        for (Map.Entry<Character, Integer> entry : 
             map.entrySet()) { 
  
            if (entry.getValue() > 1) { 
                System.out.println(entry.getKey() 
                                   + " : "
                                   + entry.getValue()); 
            } 
        } 
	}
}
