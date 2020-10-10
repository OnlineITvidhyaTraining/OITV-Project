package WorkingwithWindowElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITEx1 {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Baby-Playing-with-Cap-High-Qaulity-Laptop-Background-Wallpaper");
	}
	
	
	@Test
	public void data() throws InterruptedException, IOException{
		driver.findElement(By.xpath("//*[@id='DL']/div")).click();
		Thread.sleep(3000);
	java.lang.Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\prog1.exe");
		
		
		
		
		
		
	}
}
