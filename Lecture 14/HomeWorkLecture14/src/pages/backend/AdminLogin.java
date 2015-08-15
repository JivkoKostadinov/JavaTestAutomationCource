package pages.backend;

import org.openqa.selenium.By;
import org.testng.Assert;

import pages.backend.enums.Password;
import pages.backend.enums.Username;
import browser.Browser;

public class AdminLogin {

	public static void goTo() {
		Browser.instance.get("http://shop.pragmatic.bg/admin");
	}

	public static void logIn(Username username, Password password) {
		Browser.instance.findElement(By.name("username")).sendKeys(username.getUsername());
		Browser.instance.findElement(By.name("password")).sendKeys(password.getPassword());
		Browser.instance.findElement(By.linkText("Login")).click();
	}

	/**
	 * This a method that will mark the test as failed if the parameter is not same as the one on the page
	 * 
	 * @param errorMessageToAssert based on that parameter it will check if it is the same with what's shown as error message on the page
	 * 
	 */
	public static void assertErrorMessage(String errorMessageToAssert) {
		String errorMessage = Browser.instance.findElement(By.className("warning")).getText();
		Assert.assertEquals(errorMessage, errorMessageToAssert, "The validation message for the login form is not as expected");
	}
	
	public static void logOut(String logOutButton){
		Browser.instance.findElement(By.name("logOutButton")).click();
		
	}
	
	
	

}
