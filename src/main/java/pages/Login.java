package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(className = "login-button")
	WebElement Loginbutton;
	
	public void userlogin(String Email ,String enteredPassword) {
		//email.sendKeys(Email);
		//Password.sendKeys(enteredPassword);
		//Loginbutton.click();
		
		Settextinelements(email, Email);
		Settextinelements(Password, enteredPassword);
		clickbutton(Loginbutton);
	
	 
	}
}
