
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownValue {

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
		
		  Select dropdDownValue = new Select( driver.findElement(By.id("range")));
		  assertTrue(dropdDownValue.isMultiple());
		  dropdDownValue.selectByVisibleText("Today");
		  dropdDownValue.selectByVisibleText("This Week");
		  dropdDownValue.selectByVisibleText("This Mounth");
		  dropdDownValue.selectByVisibleText("This Year");
		  assertEquals(4,dropdDownValue.getAllSelectedOptions().size());
		  
		  List<String> expectedValue = Arrays.asList(new String[]{"Today", "This Week", "This Mounth", "This Year"});
		  List<String> selectedOptions = new ArrayList<String>();
		  
		  for(WebElement option : dropdDownValue.getAllSelectedOptions())
			  selectedOptions.add(option.getText());
		  
		  
		  
		  assertArrayEquals(expectedValue.toArray(),selectedOptions.toArray());
		  
		  
		  
		
		  
		  

		
	}
	

	
}


