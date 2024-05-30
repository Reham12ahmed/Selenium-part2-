package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	
	
	
	//Create constructor
	public PageBase(WebDriver driver) {
		//The PageFactory class is part of the Page Object pattern, which helps in organizing and maintaining the web elements
		//The initElements() method is a static method of the PageFactory class that initializes the web elements defined in the page object class
		//this: It refers to the current instance of the page object class
		PageFactory.initElements(driver, this);
	}
	//The best way to achieve good performance
	//the function is protected as we used it in package level
	
	protected static void clickbutton(WebElement button) {
		button.click();
	}
	
	
	//to create a set elements function instead of ".sendkeys"
	//the function is protected as we used it in package level
	protected static void Settextinelements(WebElement textelement,String value) {
		textelement.sendKeys(value);
	}
	
	protected static void selectfromDDL(WebElement nameofDDL, String text) {
		 Select selectobj=new Select(nameofDDL);
		 selectobj.selectByVisibleText(text);
		
	}
}
