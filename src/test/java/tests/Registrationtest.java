package tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.Home;

import pages.PageBase;
import pages.Registration;

public class Registrationtest extends Testbase{
	Home home;
	Registration reg;
	PageBase base;
	Logintest loginobj;
	//Login loginobj;
//Name:This is the name of data provider	
	@DataProvider(name="Registration")
	public Object [][] UserRegisterationData() throws IOException
	{
		ExcelReader Er=new ExcelReader();
		return Er.getExcelData(System.getProperty("user.dir")+"/src/test/java/data/Userdata.xlsx","Registration");
		
		
	}
	@DataProvider(name="Eligibilitychecktest1")
	public Object [][] UserEligibilitychecktest() throws IOException
	{
		ExcelReader Er=new ExcelReader();
		return Er.getExcelData(System.getProperty("user.dir")+"/src/test/java/data/Userdata.xlsx","Eligibilitychecktest");
		
		
	}

	@Test(priority = 0,dataProvider = "Registration")
	public void usercanregisterationsuccessfully(String firstname,String Lastname,String mail,String Phone,String Password,String ConfirmPassword,String Sourceofenquiry,String Development,String PrimaryInterest) {
		home=new Home(driver);
		home.registerationPage();
		reg=new Registration(driver);
		reg.userRegistration(firstname, Lastname, mail,Phone, Password, ConfirmPassword,Sourceofenquiry, Development, PrimaryInterest);
		Assert.assertTrue(reg.successmessage.getText().contains("completed"));
		reg.usercanlogout();
	
	}
	
/*	@Test(dependsOnMethods = {"usercanregisterationsuccessfully"})
	public void usercanlogout() {
		reg.usercanlogout();
			}
*/
	@Test(priority = 1,dataProvider = "Eligibilitychecktest1")
	public void Eligibilitychecktest(String value , String currenthomeowner , String yourage , String residency , String savings) {
		loginobj=new Logintest();
		loginobj.usercanloginsuccessfully("layanqciytg3629682@015.com" , "P@ssw0rd");
		reg.Eligibilitycheck(value,currenthomeowner,yourage,residency,savings);
		Assert.assertTrue(reg.Verified.getText().contains("Verification"));
	}

}
