package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.TestBase;
import pages.RubyGemsHome;
import pages.RubyGemsRubydebug19;
import pages.RubyGemsSearch;

public class RubyGemsTests extends TestBase {

	private static String searchString = "ruby-debug19"; 
	private static String expectedAuthors = "Kent Sibilev, Mark Moseley";
 
	private static String expectedDependency1 = "columnize";
	private static String expectedDependency2 = "linecache19";
	private static String expectedDependency3 = "ruby-debug-base19";
	
	@BeforeClass
	public void beforeClass() {
		searchForRubyDebug19();
	}
	
	
	@Test
	public void whenSearchingForauthors() {
		//Arrange
		String actual = "";

		//Act
		actual = RubyGemsRubydebug19.getAuthors();
		
		//Assert
		Assert.assertEquals(actual, expectedAuthors, "The authors did not match! Expected: [" + expectedAuthors + "] actual: [" + actual + "]");
	}

	@Test
	public void whenSearchingForDependency1() {
		//Arrange
		
		//Act
		String actual = RubyGemsRubydebug19.getDependency1();
		
		//Assert
		Assert.assertEquals(actual, expectedDependency1, "The first dependency did not match! Expected [" + expectedDependency1 + "] and actual: []"+ actual + "]");
	}

	@Test
	public void whenSearchingForDependency2() {
		//Arrange
		
		//Act
		String actual = RubyGemsRubydebug19.getDependency2();
		
		//Assert
		Assert.assertEquals(actual, expectedDependency2, "The second dependency did not match! Expected [" + expectedDependency2 + "] and actual: []"+ actual + "]");
	}

	@Test
	public void whenSearchingForDependency3() {
		//Arrange
		
		//Act
		String actual = RubyGemsRubydebug19.getDependency3();
		
		//Assert
		Assert.assertEquals(actual, expectedDependency3, "The first dependency did not match! Expected [" + expectedDependency3 + "] and actual: []"+ actual + "]");
	}

	private void searchForRubyDebug19() {
		RubyGemsHome._goto();
		RubyGemsHome.searchFor(searchString);
		RubyGemsSearch.clickOnFirstMatch();

		RubyGemsRubydebug19.displayRuntimeDependencies();
		RubyGemsRubydebug19.displayAuthors();
	}
	
}
