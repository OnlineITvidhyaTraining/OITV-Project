package WorkingwithWindowElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithRobot1 {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Baby-Playing-with-Cap-High-Qaulity-Laptop-Background-Wallpaper");
	}
	
	   @Test
	   public void data() throws AWTException, InterruptedException{
			Thread.sleep(3000);

		   driver.findElement(By.xpath("//*[@id='DL']/div")).click();
		   
		Robot rb=new Robot();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
        rb.keyPress(KeyEvent.VK_ENTER);
		   
		   
		   
		   
		   
	   }
	
}
