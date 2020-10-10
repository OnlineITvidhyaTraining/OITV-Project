package Workingwithpopups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popupsexap {

	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/popuptest1.html");
	}
	@Test
	public void popup() throws InterruptedException{
		Thread.sleep(3000);


String parent=driver.getWindowHandle();
Set<String>pops=driver.getWindowHandles();	

Iterator i=pops.iterator();

while(i.hasNext()){
	String pophandel=i.next().toString();
	
	if(!pophandel.contains(parent)){
		
		driver.switchTo().window(pophandel);
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
	}
	
}
