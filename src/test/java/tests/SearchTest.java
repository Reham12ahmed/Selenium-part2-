package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Searchpage;

public class SearchTest extends Testbase{
	Searchpage searchscr;
	
	@Test
	public void usercanSearch() {
		searchscr=new Searchpage(driver);
		searchscr.Search("For sale 1");
		Assert.assertTrue(searchscr.Producttitle.getText().contains("For Sale 1 bed property in Perivale"));
	}

}

