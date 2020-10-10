package WebdriverwithPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetLinknameinsertintoExcel {
	
	
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void data() throws Exception{
		
 fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");	
 wbo=new XSSFWorkbook(fso);
 wso=wbo.getSheet("sheet2");
 
 String value=driver.findElement(By.linkText("Gmail")).getText();
wso.createRow(0).createCell(0).setCellValue(value);

driver.close();
 
 FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
 wbo.write(fo);
 
 
 
 
		
		
		
		
		
		
		
	}

}
