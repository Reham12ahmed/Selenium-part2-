package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUs;
import pages.Home;


public class ContactUsTest extends Testbase{
	Logintest login;
	ContactUs contactpage;
	Home homescreen;
	
	@Test
	public void usercanaddenquiry() {
		login=new Logintest();
		login.usercanloginsuccessfully();
		homescreen=new Home(driver);
		homescreen.openContactUS();
		contactpage=new ContactUs(driver);
		contactpage.ContactUS("enquiry", "What is the enquiry");
		Assert.assertTrue(contactpage.SuccessMessage.getText().contains("successfully"));
		
	}

}
