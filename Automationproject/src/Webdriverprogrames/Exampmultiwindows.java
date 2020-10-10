package Webdriverprogrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exampmultiwindows {
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
	}
	
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(9000);
		
	driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		String parent=driver.getWindowHandle();
Set<String>pops=driver.getWindowHandles();

Iterator i=pops.iterator();

	while(i.hasNext()){
String pophandel=i.next().toString();	
	
if(!pophandel.contains(parent)){
	driver.switchTo().window(pophandel);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='tabs-wrapper']/div[2]/div[2]/a")).click();
	
}

	}
	
	
	}

}
