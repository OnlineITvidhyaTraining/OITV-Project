package WorkingwithBarcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;

import WorkingwithQRcode.BufferedImageLuminanceSource;

public class barcodexamp {
	
FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.barcodesinc.com/generator/index.php");
	}
	@Test
	public void data() throws IOException{
		
	String Imageurl=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/div/p/a/img")).getAttribute("src");
		
	URL url=new URL(Imageurl);
	
	BufferedImage Bimage=ImageIO.read(url);
	
	LuminanceSource lsource=new BufferedImageLuminanceSource(Bimage);
	
	BinaryBitmap bmap=new BinaryBitmap(new HybridBinarizer(lsource));
	
    Result rs=new MultiFormatReader().decode(bmap);
    System.out.println("my QR code value is"+"  "+rs.getText());
	
		
		
		
	}
	
	
	

}
