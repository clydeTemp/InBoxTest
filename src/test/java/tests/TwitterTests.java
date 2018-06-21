package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TwitterLogin;
import pages.TwitterMain;

public class TwitterTests {
	
	@Test
	public void whenPostingHelloWorld() {
		//Arrange
		String expectedTweet = "Hello World!";
		String actual = "";
		
		TwitterLogin.login();

		//Act
		TwitterMain.postTweet(expectedTweet);
		actual = TwitterMain.getContentOfLatestTweet();
		
		//Assert
		Assert.assertEquals(actual, expectedTweet, "The content of the latest tweet is not as expected!");
	}

}
