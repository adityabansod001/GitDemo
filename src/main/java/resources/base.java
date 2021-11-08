package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {
		
		 prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\asus\\eclipse-workspace\\E2EProject2\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("Chrome")) {
			
			//Perform Chrome launch
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\asus\\\\Desktop\\\\Selenium setup\\\\Chrome driver\\\\chromedriver.exe");
			 driver = new ChromeDriver();

		}else {
			//Perform IE launch
			
			System.setProperty("webdriver.IE.driver", "C:\\Users\\asus\\Desktop\\Selenium setup\\IEdriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait for safeside in framework
		return driver;
	}

	public String getScreenshotPath(String Failedtestname, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+Failedtestname+".png";
		FileUtils.copyFile(source, new File(destinationFile));//**FileUtils* this will give error, hence add Apache Common IO dependencies in POM.XML file
		return destinationFile;
	}
	
}
