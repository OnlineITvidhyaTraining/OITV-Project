package Webdriverprogrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exappopups {
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/popuptest1.html");
	}
	
	@Test
	public void data() throws InterruptedException{
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
