package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import framework.TestBase;

public class RubyGemsHome extends TestBase {
	private static final String rubyGemsBaseUrl = "https://rubygems.org/";
	
	private static final By searchFieldLocator = By.id("home_query");
	
	public static void enterTextIntoSearch(String content) {
		WebElement element = driver.findElement(searchFieldLocator);
		element.sendKeys(content);
	}

	public static void _goto() {
		driver.get(rubyGemsBaseUrl);		
	}

	public static void searchFor(String searchString) {
		enterTextIntoSearch(searchString);
		hitEnterOnSearchfield();
		
	}

	private static void hitEnterOnSearchfield() {
		WebElement element = driver.findElement(searchFieldLocator);
		element.sendKeys(Keys.RETURN);
	}
	
}
