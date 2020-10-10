package AutomationFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven1 {
	
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	Row r;
	Reusablemethods page1;

	
	@Test
	public void data() throws IOException, InterruptedException{
		page1=new Reusablemethods();
		page1.open();
		fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet1");
		
int rowc=wso.getLastRowNum();
for(int i=1;i<=rowc;i++){
	r=wso.getRow(i);
	
page1.login(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());

Thread.sleep(3000);

String Actual=driver.getCurrentUrl();
	
r.createCell(3)	.setCellValue(Actual);
	
String Expected=r.getCell(2).getStringCellValue();

if(Actual.equals(Expected)){
	
	r.createCell(4).setCellValue("pass");
}
else{
	r.createCell(4).setCellValue("fail");

}
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
}
		
FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
wbo.write(fo);
		
		
		
		
		
	}
	

}
