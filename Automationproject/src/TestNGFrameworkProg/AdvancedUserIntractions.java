package TestNGFrameworkProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdvancedUserIntractions {
FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void operation(){
		WebElement Men=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(Men).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
