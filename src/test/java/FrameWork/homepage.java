package FrameWork;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import resources.base;

public class homepage extends base{
	WebDriver driver;
	public static Logger log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void Initialize() throws IOException {
		
		
		driver= initializeDriver();
		//driver.get(prop.getProperty("url"));	If we write it here broswer will no hit url for second data only one data will be entered
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

	@Test(dataProvider= "getData")
	public void UserAuthintication(String username, String password, String text) throws IOException {
		
		
		driver.get(prop.getProperty("url"));//hence for this perticular case need to write it inside so that url cab be hit befoe entering every data
		LandingPage lp= new LandingPage(driver);
		LoginPage l = lp.getLogin();//getlogin() method is returning the object l
		l.enterEmail().sendKeys(username);
		l.enterPW().sendKeys(password);
		System.out.println(text);
		log.info(text);
		l.clickLogin().click();
		
	}
	
	 @DataProvider
	 public Object[][] getData() {
		 
		 //rows= for how may data types test should run
		 //column= how many values per test (0-1-2=3)
		 //Object[2][3] - here we are defining size hence 2 = 1,2 an not 0,1,2.
		
		 Object [][] data = new Object[2][3];
			//1st Row	 
		 data [0][0]= "abc@xyz.com";
		 data [0][1]= "12345";
		 data [0][2]= "Restricted user";
		 
//		 //2nd Row
		 data [1][0]= "def@xyz.com";
		 data [1][1]= "1212";
		 data [1][2]= "Non-Restricted User";
		 
		 return data;
		 
	 }
}
