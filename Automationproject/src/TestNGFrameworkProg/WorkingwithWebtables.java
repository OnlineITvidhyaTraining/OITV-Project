package TestNGFrameworkProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
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
	public void data(){
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement>nrows=table.findElements(By.tagName("tr"));
		for(int i=0;i<nrows.size();i++){
			List<WebElement>ncols=nrows.get(i).findElements(By.tagName("td"));
			for(int n=0;n<ncols.size();n++){
				System.out.print(ncols.get(n)+"   ");
			}
			System.out.println();
		}
		
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
}
