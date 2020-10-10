package Workingwithmultiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class expmultiwindows {
	FirefoxDriver driver;

	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
	}
	@Test
	public void popup() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='header']/div[2]/ul[2]/li[1]/a")).click();
Thread.sleep(3000);
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
