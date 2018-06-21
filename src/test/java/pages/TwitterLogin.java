package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.TestBase;

public class TwitterLogin extends TestBase {
	private static final String twitterLoginUrl = "https://twitter.com/login";
	private static String userName = "barbiepinkf2@bcompiled3.com";
	private static String password = "supersecret";
	private static final By usernameFieldLocator = By.xpath("//input[contains(@class, 'js-username-field')]");
	private static final By passwordFieldLocator = By.xpath("//input[@class='js-password-field']");
	private static final By loginButtonLocator = By.xpath("//button[contains(@class, 'submit')]");

	public static void login() {
		driver.get(twitterLoginUrl);
		
		enterUsername(userName);
		enterPassword(password);
		clickLogin();
	}

	private static void clickLogin() {
		WebElement element = driver.findElement(loginButtonLocator);
		element.click();
	}

	private static void enterPassword(String content) {
		WebElement element = driver.findElement(passwordFieldLocator);
		element.sendKeys(content);
	}

	private static void enterUsername(String content) {
		WebElement element = driver.findElement(usernameFieldLocator);
		element.sendKeys(content);
	}
}