package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.TestBase;

public class TwitterMain extends TestBase {
	private static final By tweetButtonLocator = By.id("global-new-tweet-button");
	private static final By tweetBoxLocator = By.xpath("//div[@id='Tweetstorm-tweet-box-0']//div[@class='tweet-content']//div[contains(@class, 'RichEditor')]");
	private static final By tweetMessageTwwetButtonLocator = By.xpath("//button[contains(@class, 'SendTweetsButton')]//span[contains(text(), 'Tweet')]");
	private static final By homeIconLocator = By.id("global-nav-home");
	private static final By firstTweetLocator = By.xpath("//div[@class = 'js-tweet-text-container']/p");

	public static void postTweet(String content) {
		clickTweetButton();
		enterTweet(content);
		clickBirdTweetButton();
	}

	private static void clickHomeButton() {
		mySleep(5);
		WebElement element = driver.findElement(homeIconLocator);
		element.click();
		mySleep(5);
	}

	private static void enterTweet(String content) {		
		WebElement element = driver.findElement(tweetBoxLocator);

		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys(content);
		actions.build().perform();
	}

	private static void clickTweetButton() {
		WebElement element = driver.findElement(tweetButtonLocator);
		element.click();
	}

	public static String getContentOfLatestTweet() {
		String actual = "";

		// refresh page
		clickHomeButton();
		
		WebElement element = driver.findElement(firstTweetLocator);
		actual = element.getText();
		return actual;
	}

	private static void clickBirdTweetButton() {
		WebElement element = driver.findElement(tweetMessageTwwetButtonLocator);
		element.click();
	}

}