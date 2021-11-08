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

public class ValidateNavigationBar extends base{
	WebDriver driver;
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void Initialize() throws IOException {
	
	
	
	driver= initializeDriver();
	driver.get(prop.getProperty("url"));
}

@AfterTest
public void teardown() {
	
	driver.close();
}
@Test
public void ValidateNavigationBar() throws IOException {
	
	
	LandingPage lp= new LandingPage(driver);
	
	
	Assert.assertTrue(lp.getNavbar().isDisplayed());
	log.info("NaviagationBar is validated");
	
	


}	

}
