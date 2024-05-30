package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends PageBase{

	public Searchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "small-searchterms" )
	WebElement Searchfield;
	
	@FindBy(className = "search-box-button" )
	WebElement Searchbutton;
	
	
	@FindBy(linkText = "For Sale 1 bed property in Perivale" )
	public WebElement Producttitle;
	
	public void Search(String value) {
		clickbutton(Searchfield);
		Settextinelements(Searchfield, value);
		clickbutton(Searchbutton);
		
	}
	
	public void Searchdetails() {
		clickbutton(Producttitle);
		
	}

}
