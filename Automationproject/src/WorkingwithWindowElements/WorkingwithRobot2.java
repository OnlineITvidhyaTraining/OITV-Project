package WorkingwithWindowElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithRobot2 {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
	}
	@Test
	public void data() throws InterruptedException, AWTException{
		Thread.sleep(3000);

		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(3000);

		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
}
