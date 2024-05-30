package tests;


import org.testng.annotations.Test;
import pages.Home;
import pages.MyAccount;


public class MyAccountTest extends Testbase{
Home homepage;
MyAccount profile;
Logintest login1;

@Test
public void usercanchangeprofile() {
	login1= new Logintest();
	login1.usercanloginsuccessfully();
	homepage=new Home(driver);
	homepage.Myaccountpage();
	profile=new MyAccount(driver);
	profile.ChangeProfile("Rehamedit", "Ahmededit", "");
	
}
}
