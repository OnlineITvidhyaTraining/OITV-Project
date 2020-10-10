package TestNGproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithpopup {

	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
	}
	
	@Test
	public void data() throws InterruptedException{
driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
        String parent=driver.getWindowHandle();
        Set<String>pops=driver.getWindowHandles();
        
      Iterator i=pops.iterator();
      while(i.hasNext()){
    	  String pophandel=i.next().toString();
    	  
    	  if(!pophandel.contains(parent)){
    		  driver.switchTo().window(pophandel);
    		  Thread.sleep(5000);
    		  
driver.findElement(By.xpath("//*[@id='tabs-wrapper']/div[2]/div[2]/a")).click();  
Thread.sleep(5000);

List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("no of links are"+"  "+links.size());

    		  
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
        
        
        
        
        
        
        
		
		
		
		
		
	}
}
