package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
	
		// Singleton
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	 return driver;
	}

}
