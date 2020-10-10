package WorkingwithWindowElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITEx2 {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
	}
	@Test
	public void data() throws InterruptedException, IOException{
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(3000);

	java.lang.Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\prog2.exe");	
		
		
		
		
		
		
		
		
	}
}
