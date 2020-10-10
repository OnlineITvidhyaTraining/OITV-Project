package WorkingwithWindowElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITEx3 {
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://upload.photobox.com/en/");
	}
	@Test
	public void task() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.findElement(By.id("computer_icone_name")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button_desktop")).click();
		Thread.sleep(3000);
		
	java.lang.Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\prog3.exe");
	
	

		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
