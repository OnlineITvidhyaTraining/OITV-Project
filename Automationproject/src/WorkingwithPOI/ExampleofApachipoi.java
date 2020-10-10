package WorkingwithPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExampleofApachipoi {

	public static void main(String[] args) throws IOException {
          FileInputStream fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
          XSSFWorkbook wbo=new XSSFWorkbook(fso);
          XSSFSheet wso=wbo.getSheet("sheet1");
          
          int rowc=wso.getLastRowNum();
          
          for(int i=0;i<rowc;i++){
          String data=wso.getRow(i).getCell(0).getStringCellValue();
                System.out.println(data);
          }
          
          FileOutputStream fo= new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test.xlsx");
          wbo.write(fo);
	
	
	}
}
