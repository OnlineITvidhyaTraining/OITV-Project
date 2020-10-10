package WebdriverwithPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountnoofElementsinsetintoExcel {

	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.icicibank.com/");
	}
	@Test
	public void data() throws Exception{
		
 fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");	
 wbo=new XSSFWorkbook(fso);
 wso=wbo.getSheet("sheet2");
 
List<WebElement>Elements=driver.findElements(By.tagName("a"));
wso.createRow(0).createCell(0).setCellValue("no of links are"+"   "+Elements.size());
Elements=driver.findElements(By.tagName("img"));
wso.createRow(1).createCell(0).setCellValue("no of images are"+"   "+Elements.size());

 
 FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
 wbo.write(fo);
 
 
 
 
		
		
		
	}		
		
}
