
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IncorrectLogin {

	WebDriver driver;
	
	@Before
	public void setup(){
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.get("http://shop.pragmatic.bg/admin");
	}
	@After
	public void tearDown(){
		this.driver.quit();
	}
	
	
	@Test
	public void myFirstTest(){
		
		  WebElement username = driver.findElement(By.partialLinkText("username"));
		  username.sendKeys("admin");
		  WebElement password = driver.findElement(By.partialLinkText("password"));
		  password.sendKeys("parola");
		  WebElement login = driver.findElement(By.className("button"));
		  login.click();
		
		  WebElement mesage = driver.findElement(By.className("warning"));
		  String mesageText = mesage.getText();
		  
		  assertEquals("No match for Username and/or Password.",mesageText,"Please enter valid value");
		  

		
	}
	

	
}

