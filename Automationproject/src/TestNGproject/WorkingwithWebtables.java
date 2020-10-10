package TestNGproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithWebtables {
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		 driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void operation(){
		
for(int i=1;i<37;i++){
	for(int n=1;n<8;n++){
	
	String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+n+"]")).getText();
	System.out.print(data+"   ");
}
	System.out.println();	
}	
		
	}

}
