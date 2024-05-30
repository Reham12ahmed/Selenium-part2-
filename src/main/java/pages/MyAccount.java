package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase{

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 
	
	@FindBy(id = "customerInfoModel.FirstName")
	WebElement FirstName1;
	
	@FindBy(id = "customerInfoModel.LastName")
	WebElement LastName1;
	
	@FindBy(id = "customerInfoModel.Email")
	WebElement Email1;
	
	@FindBy(id = "save-info-button")
	WebElement Savebutton;
	
	public void ChangeProfile(String FirstName,String LastName,String Email) {
		Settextinelements(FirstName1, FirstName);
		Settextinelements(LastName1, LastName);
		Settextinelements(Email1, Email);
		clickbutton(Savebutton);
	}

}
