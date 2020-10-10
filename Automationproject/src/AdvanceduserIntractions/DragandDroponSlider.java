package AdvanceduserIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDroponSlider {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
	}
	
	@Test
	public void operation(){
		driver.switchTo().frame(0);
	WebElement Slider=driver.findElement(By.id("slider"));
		
		Actions action=new Actions(driver);
		
		int loc=Slider.getLocation().x;
		action.dragAndDropBy(Slider, 70, loc).build().perform();
		
		
	}
	
	
	
}
