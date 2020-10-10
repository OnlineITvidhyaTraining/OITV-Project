package TestNGFrameworkProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebdriverwithPOI {
	
	
	
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	 FileOutputStream fo;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	}

	@Test
	public void data() throws IOException{
		
fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");	
 wbo=new XSSFWorkbook(fso);
 wso=wbo.getSheet("sheet2");

 WebElement Dropdown=driver.findElement(By.id("themes"));
 List<WebElement>values=Dropdown.findElements(By.tagName("option"));
 
 for(int i=0;i<values.size();i++){
	 wso.createRow(i).createCell(0).setCellValue(values.get(i).getText());
 }
 
 
  fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
  wbo.write(fo);
  
  
  
 
 


		
		
		
		
		
		
		
	}
	

}
