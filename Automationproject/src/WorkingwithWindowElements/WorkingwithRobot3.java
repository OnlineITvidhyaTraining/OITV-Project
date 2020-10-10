package WorkingwithWindowElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithRobot3 {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://upload.photobox.com/en/");
	}
	
	@Test
	public void data() throws InterruptedException, AWTException{
		Thread.sleep(3000);
		driver.findElement(By.id("computer_icone_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("button_desktop")).click();
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_B);
      
		rb.keyPress(KeyEvent.VK_PERIOD);
		
		rb.keyPress(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_G);

		rb.keyPress(KeyEvent.VK_ENTER);
		
		


		
		
		

		
		
		
	}
	
	
}
