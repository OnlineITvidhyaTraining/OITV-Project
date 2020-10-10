package AutomationFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven2 {
	
	
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	Row r;
	FileOutputStream fo;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	}
	
	@Test
	public void data() throws IOException, InterruptedException{
		fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet2");
		

	WebElement country=driver.findElement(By.id("themes"));
List<WebElement>values=country.findElements(By.tagName("option"));

for(int i=0;i<values.size();i++){
	r=wso.getRow(i);
	
	String Actual=values.get(i).getText();
	r.createCell(1).setCellValue(Actual);
	
	String Expected=r.getCell(0).getStringCellValue();
	
	
	if(Expected.equals(Actual)){
		r.createCell(2).setCellValue("pass");
	}
	
	else{
		r.createCell(2).setCellValue("fail");
	}
	
	
}
			
 fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");		
	wbo.write(fo);	
		
		
		
		
		
}
}