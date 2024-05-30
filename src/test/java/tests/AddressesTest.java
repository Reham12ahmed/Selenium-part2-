package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Addresses;
import pages.Home;


public class AddressesTest extends Testbase{
	Home homescreen;
	Logintest login;
	Addresses address;
	
	
	@Test
	public void usercanregisterationsuccessfully() {
		login=new Logintest();
		login.usercanloginsuccessfully();
		homescreen=new Home(driver);
		//homescreen.ClickOkbutton();
		homescreen.openAddresescreen();
		address=new Addresses(driver);
		address.openaddressscreen();
	String email=address.addnewaddress("reham1", "Ahmed", "a@r11.com", "Cairo","Egypt", "Future city", "012", "07123456789");
	Assert.assertTrue(address.Addresslist.getText().contains(email));
	
	}

}
