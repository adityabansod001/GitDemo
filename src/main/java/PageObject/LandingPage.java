package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
	this.driver= driver;
	}
	
	public LandingPage() {
		// TODO Auto-generated constructor stub
	}

	By signin= By.cssSelector("a[href*= 'sign_in']");
	
	By signup= By.cssSelector("a[href*= 'sign_up']");
	
	By title = By.xpath("//div[@class = 'text-center']/h2");
	
	By navbar = By.cssSelector(".nav.navbar-nav.navbar-right"); 
	
	
	public LoginPage getLogin() {
		
		driver.findElement(signin).click();
		LoginPage l = new LoginPage(driver);
		 return l;
	}
	
	
	public WebElement getSignUp() {
		return driver.findElement(signup);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}

	

}

