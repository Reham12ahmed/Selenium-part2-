package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageBase {

	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "Log in")
	WebElement login;
	
	@FindBy(linkText = "Register")
	WebElement register;
	
	
	@FindBy(className = "ico-account")
	WebElement Myaccount;
	
	@FindBy(linkText = "Addresses")
	WebElement Addresses;
	
	@FindBy(linkText = "Contact us")
	WebElement Contactus;
	
	@FindBy(className = "ok-button")
	WebElement OKcookies;
	
	public void OpenLoginPage() {
		
		//login.click();
		clickbutton(login);
	}
public void registerationPage() {
	//register.click();
		clickbutton(register);
	}

public void Myaccountpage() {
		clickbutton(Myaccount);
	}

public void openAddresescreen() {
	
		clickbutton(Addresses);
	}

public void openContactUS() {
	
	clickbutton(Contactus);
}

public void ClickOkbutton() {
	
	clickbutton(OKcookies);
}
}
