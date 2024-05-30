package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageBase{

	public ContactUs(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "input.fullname")
	WebElement Name;

	@FindBy(id = "Enquiry")
	WebElement Enquiryfield;

	@FindBy(className = "contact-us-button")
	WebElement contactbutton;

	@FindBy(css = "	div.result")
	public WebElement SuccessMessage;
	
	public void ContactUS(String FullName ,String Enquiry) {
		
		clickbutton(Name);
		Settextinelements(Name, FullName);
		clickbutton(Enquiryfield);
		Settextinelements(Enquiryfield, Enquiry);
		clickbutton(contactbutton);

}
}