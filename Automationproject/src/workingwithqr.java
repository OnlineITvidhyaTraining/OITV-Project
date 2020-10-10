import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class workingwithqr {

	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.barcodesinc.com/generator/index.php");
	}
	@Test
	public void data() throws IOException, NotFoundException, InterruptedException{
		Thread.sleep(3000);
		String Imageurl=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/div/p/a/img")).getAttribute("src");
		
		URL url=new URL(Imageurl);
		
		BufferedImage Bimage=ImageIO.read(url);
		
LuminanceSource lsource=new BufferedImageLuminanceSource(Bimage);	

BinaryBitmap Bmap=new BinaryBitmap(new HybridBinarizer(lsource));
		
Result rs=new MultiFormatReader().decode(Bmap);
System.out.println("My Barcode Code value is"+"    "+rs.getText());
		
		
		
		
		
	}
	
	
	
	
	
}
