package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By email= By.cssSelector("[type= 'email']");
	By password= By.cssSelector("[type= 'password']");
	By submit = By.cssSelector("[type= 'submit']");
	


	public WebElement enterEmail() {
		return driver.findElement(email);

	}
	
	public WebElement enterPW() {
		return driver.findElement(password);

	}
	
	public WebElement clickLogin() {
		 return driver.findElement(submit);
		 

}
}
