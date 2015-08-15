package pages.backend;

import org.openqa.selenium.By;
import org.testng.Assert;

import browser.Browser;

public class AdminDashboard {

	public static void assertPageTitle(String pageTitle) {
		Assert.assertTrue(Browser.instance.getTitle().equalsIgnoreCase(pageTitle),
				"You were unable to login, please file a bug");
	}

	public static void findElementPresent(String element){
		Browser.instance.findElement(By.className("element")).toString();
	}
	
	
	
	
	
}
