package WorkingwithWindowElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex1Sikuli {
	
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
	}

	@Test
	public void data() throws InterruptedException, FindFailed{
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(3000);

		Screen sc=new Screen();
		Pattern pt=new Pattern("C:\\Users\\Lenovo\\Desktop\\Capture1.PNG");
		
		sc.click(pt);
		
		
		
		
		
		
	}

}
