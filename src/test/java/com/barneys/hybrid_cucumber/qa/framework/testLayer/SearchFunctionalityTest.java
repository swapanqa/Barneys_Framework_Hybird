package com.barneys.hybrid_cucumber.qa.framework.testLayer;



import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;



import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PageFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PropertyReaderService;

public class SearchFunctionalityTest {
	


	private WebDriver driver = null;
	private PageFactory barneys = null;
//	private HomePage homePage = null;
//	private SearchPage searchPage = null;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getInstance("chrome").getDriver();
		barneys = PageFactory.getInstance();
		
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		
		driver.manage().deleteAllCookies();

	
	}
	
	

	@Test
	
	public void test() {
	
		barneys.homePage().goToTrunkedPage();
		barneys.homePage().brandItem();
		//barneys.womenPage().hoverAction();
		//barneys.womenPage().bootlink();
		
		
		//barneys.searchPage().searchItem("shirt");
		//barneys.searchPage().verifySearchText("shirt");
       // barneys.searchPage().verifySearchPageTitle("Search Results for shirt | Barneys New York");
        
		
	
        
        
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@After
	public void tearDown() {
		
	
		
		//DriverFactory.getInstance().removeDriver();
		
	}	
	
	
	

}
