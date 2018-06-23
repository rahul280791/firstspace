package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Yeah!! Setups is done...");
		
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.flipkart.com");
		driverChrome.manage().window().maximize();
		
		
	}

}
