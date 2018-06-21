package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.TestBase;

public class RubyGemsRubydebug19 extends TestBase {
	private static By runtimeDependenciesLocator = By.xpath("//*[@id='runtime_dependencies']//div[@class='t-list__items']//*[@class='t-list__item']/strong");
	private static By authorsLocator = By.xpath("//div[@class='gem__members']//ul[@class='t-list__items']//li[@class='t-list__item']/p");
	private static String dependency1 = "";
	private static String dependency2 = "";
	private static String dependency3 = "";
	private static String actualAuthors = "";
	
	
	public static void displayRuntimeDependencies() {
		String dependcy = "";
		Integer counter = 1;
		
		Iterable<WebElement> elements = driver.findElements(runtimeDependenciesLocator);
		
		for (WebElement element : elements) {
			dependcy = element.getText();
			System.out.println("dependency: [" + dependcy + "]");
			
			if (counter == 1) { dependency1 = dependcy;}
			else if (counter == 2) { dependency2 = dependcy;}
			else if (counter == 3) { dependency3 = dependcy;}
			counter++;
		}
		
	}

	public static void displayAuthors() {
		String authorsString = "";
		
		WebElement element = driver.findElement(authorsLocator);
		authorsString = element.getText();
		
		System.out.println("Authors: [" + authorsString + "]");
		actualAuthors = authorsString;
	}

	public static String getDependency1() {
		return dependency1;
	}
	
	public static String getDependency2() {
		return dependency2;
	}

	public static String getDependency3() {
		return dependency3;
	}

	public static String getAuthors() {
		return actualAuthors;
	}
}
