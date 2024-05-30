package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends PageBase{


	public Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "RegisterModel_FirstName")
	WebElement FirstName1;

	@FindBy(id = "RegisterModel_LastName")
	WebElement LastName1;

	@FindBy(id = "RegisterModel_Email")
	WebElement email;
	
	@FindBy(id = "RegisterModel_Phone")
	WebElement Phone;

	@FindBy(id = "RegisterModel_Password")
	WebElement Password0;

	@FindBy(id = "RegisterModel_ConfirmPassword")
	WebElement ConfirmPassword1;

	@FindBy(id = "consent1")
	WebElement checkbox;

	@FindBy(id = "register-button")
	WebElement registerbutton;

	@FindBy(id = "SourceOfEnquiry")
	WebElement SourceOfEnquiryDDL;

	@FindBy(xpath = "//*[@id=\"SchemeList\"]")
	WebElement DevelopmentDDL;

	@FindBy(id = "PrimaryInterest")
	WebElement PrimaryInterestDDL;

	@FindBy(css = "div.result")
	public WebElement successmessage;

	@FindBy(linkText = "Log out")
	public WebElement LogoutLink;

	@FindBy(id = "GrossAnnualHouseIncome")
	WebElement thefirstquestion;

	@FindBy(id = "tll_homeowner")
	WebElement thesecquestion;

	@FindBy(id = "tll_Aged18orOverEnum")
	WebElement thethirdquestion;

	@FindBy(id = "tll_rightofukresidency")
	WebElement theforthquestion;
	
	@FindBy(id = "Savings")
	WebElement currentlysavings;
	
	@FindBy(css = "button.reg-btn")
	WebElement nextbutton;

	
	@FindBy(className = "register-next-step-button")
	WebElement nextbutton1;
	
	@FindBy(className = "string-6949")
	public WebElement Verified;
	
	public void userRegistration(String FirstName ,String LastName ,String Email ,String Phone1,String Password , String ConfirmPassword ,String Sourceofenquiry ,String Development, String PrimaryInterest) {
		//email.sendKeys(Email);
		//Password.sendKeys(enteredPassword);
		//Loginbutton.click();

		Settextinelements(FirstName1, FirstName);
		Settextinelements(LastName1, LastName);
		Settextinelements(email, Email);
		Settextinelements(Phone, Phone1);
		Settextinelements(Password0, Password);
		Settextinelements(ConfirmPassword1, Password);
		selectfromDDL(SourceOfEnquiryDDL, Sourceofenquiry);
		selectfromDDL(DevelopmentDDL, Development);
		selectfromDDL(PrimaryInterestDDL, PrimaryInterest);
		//clickbutton(checkbox);
		clickbutton(registerbutton);


	}

	public void usercanlogout() {
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		clickbutton(LogoutLink);

	}

	public void Eligibilitycheck(String value , String currenthomeowner , String yourage , String residency , String savings) {
		Settextinelements(thefirstquestion, value);
		clickbutton(thesecquestion);
		selectfromDDL(thesecquestion, currenthomeowner);
		clickbutton(thethirdquestion);
		selectfromDDL(thethirdquestion, yourage);
		clickbutton(theforthquestion);
		selectfromDDL(theforthquestion, residency);
		clickbutton(nextbutton);
		Settextinelements(currentlysavings, savings);
		clickbutton(nextbutton1);
		


	}

}
