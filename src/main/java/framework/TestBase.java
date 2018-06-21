package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class TestBase {
	public static WebDriver driver = Driver.getDriver();
	
	@AfterSuite(alwaysRun = true)
	public static void afterSuite() {
		driver.close();
	}
	
	public static WebElement waitForElement(final By howToFind) 
	{
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("Tweetstorm-dialog-header")));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(howToFind);
		
		return element;
	}
	
	public static void mySleep(int secondsToSleep)
	{
		try 
		{
			Thread.sleep(secondsToSleep * 1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
