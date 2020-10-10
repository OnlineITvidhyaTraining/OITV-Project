package AdvanceduserIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseMovingOperation {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
	}
	@Test
	public void data() throws InterruptedException{
		
		driver.switchTo().frame(0);
	WebElement Drag=driver.findElement(By.id("draggable"));
	
	WebElement Drop=driver.findElement(By.id("droppable"));
	Thread.sleep(5000);
	Actions action=new Actions(driver);
	action.dragAndDrop(Drag, Drop).build().perform();
	
		
		
		
	}
	
}
