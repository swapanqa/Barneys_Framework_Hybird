package com.barneys.hybrid_cucumber.qa.framework.stepsBase;

import org.junit.Assert;

import com.barneys.hybrid_cucumber.qa.framework.pageLayer.HomePage;
import com.barneys.hybrid_cucumber.qa.framework.pageLayer.SearchPage;
import com.barneys.hybrid_cucumber.qa.framework.utils.PageFactory;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchPageStep extends CommonPageStep {
	
	    HomePage homePage =PageFactory.getInstance().homePage();
	     SearchPage searchPage = PageFactory.getInstance().searchPage();


@Then("^Homepage should display$")
public void homepage_should_display()  {
	
	
	 String title = driver.getTitle();
     Assert.assertEquals("Luxury Designer Handbags, Shoes and Clothing | Barneys New York", title);
	
  
}

@When("^User click searchLink button$")
public void user_click_searchLink_button()  {
	
	homePage.goToSearchPage();
   
}

@Then("^Search in put Box display$")
public void search_in_put_Box_display()  {
   
}

@When("^User enters searchword as \"([^\"]*)\"$")
public void user_enters_searchword_as(String arg1)  {
   
}

@When("^User click search button$")
public void user_click_search_button()  {
   
}

@Then("^Search results title page should display$")
public void search_results_title_page_should_display()  {
   
}

@Then("^All items should contain shirt in the product title$")
public void all_items_should_contain_shirt_in_the_product_title()  {
   
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
