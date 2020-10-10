import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithAlerts {


		FirefoxDriver driver;
		@BeforeTest
		public void open(){
			driver=new FirefoxDriver();
			driver.get("https://www.tsrtconline.in/oprs-web/");
		}
		
		@Test
		public void data() throws InterruptedException{
			driver.findElement(By.name("searchBtn")).click();
			//driver.switchTo().alert();
			String text=driver.switchTo().alert().getText();
			System.out.println(text);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		
		
	}


