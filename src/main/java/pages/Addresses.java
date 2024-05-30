package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addresses extends PageBase{

	public Addresses(WebDriver driver) {
		super(driver);
	}
	String firstname;
	String Lastname;
	
	
	@FindBy(className = "add-address-button")
	WebElement Addaddressbutton;
	
	@FindBy(id = "Address_FirstName")
	WebElement AddressFirstName;
	
	@FindBy(id = "Address_LastName")
	WebElement AddressLastName;
	
	@FindBy(id = "Address_Email")
	WebElement AddressEmail;
	
	@FindBy(id = "Address_City")
	WebElement AddressCity;
	
	@FindBy(id = "Address_Address1")
	WebElement AddressAddress1;
	
	@FindBy(id = "Address_ZipPostalCode")
	WebElement AddressZipPostalCode;
	
	@FindBy(id = "Address_CountryId")
	WebElement Country1;
	
	@FindBy(id = "Address_PhoneNumber")
	WebElement AddressPhoneNumber;
	
	@FindBy(className = "save-address-button")
	WebElement saveaddressbutton;
	
	@FindBy(css = "div.address-list > div:last-child>ul li.email")
	public WebElement Addresslist;
	
public void openaddressscreen() {
	clickbutton(Addaddressbutton);
}

public String addnewaddress(String FirstName ,String LastName,String Email,String City,String country,String Address1,String ZipPostalCode,String PhoneNumber) {
	Settextinelements(AddressFirstName, FirstName);
	Settextinelements(AddressLastName, LastName);
	Settextinelements(AddressEmail, Email);
	Settextinelements(AddressCity, City);
	Settextinelements(AddressAddress1, Address1);
	selectfromDDL(Country1, country);
	Settextinelements(AddressZipPostalCode, ZipPostalCode);
	Settextinelements(AddressPhoneNumber, PhoneNumber);
	clickbutton(saveaddressbutton);
	return Email;
	
}




}
