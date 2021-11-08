package FrameWork;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import resources.base;

public class ValidateTitle extends base{
	WebDriver driver;//Local copy of driver is needed so that test can be run in parallel.
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void Initialize() throws IOException {
		
		driver= initializeDriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("URL hit");
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
		log.info("Browser closed");
		
	}
	
	
	@Test
	public void ValidateTitle() throws IOException {
		
		
		LandingPage lp= new LandingPage(driver);
		
		
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
		log.info("Title is validated");
		
		
	
	
	}	

}
