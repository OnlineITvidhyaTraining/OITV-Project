package WorkingwithWebtables;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetdatafromRows {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){	
	driver=new FirefoxDriver();
	driver.get("https://www.timeanddate.com/worldclock/");		
	}
	
	@Test
	public void data(){
	
		for(int i=1;i<38;i++){
String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();	
System.out.println(data);
		}
	}
	
}
