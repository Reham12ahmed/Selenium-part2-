package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.Home;
import pages.Login;
import pages.Registration;

public class Logintest extends Testbase{
	Home homepage;
	Login loginscreen;
	Registration reg;
	
@DataProvider(name="Login1")
	public Object [][] UserEligibilitychecktest() throws IOException
	{
		ExcelReader Er=new ExcelReader();
		return Er.getExcelData(System.getProperty("user.dir")+"/src/test/java/data/Userdata.xlsx","Login");
		
		
	}
	@Test(priority = 0,dataProvider = "Login1")
	public void usercanloginsuccessfully(String username,String password) {
		homepage=new Home(driver);
		homepage.OpenLoginPage();
		loginscreen=new Login(driver);
		loginscreen.userlogin(username, password);
		reg=new Registration(driver);
		Assert.assertTrue(reg.LogoutLink.getText().contains("Log out"));
		
		
	}


}
