package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.TestBase;

public class RubyGemsSearch extends TestBase {
	private static By rubyDebug19FirstMatchLocator = By.xpath("//h2[contains(text(), 'ruby-debug19')]");

	public static void clickOnFirstMatch() {
		WebElement element = driver.findElement(rubyDebug19FirstMatchLocator);
		element.click();
	}
}
