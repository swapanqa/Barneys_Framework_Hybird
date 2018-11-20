package com.barneys.hybrid_cucumber.qa.framework.testLayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PageFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PropertyReaderService;
import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;


public class LoginFunctionalityTest extends SeleniumUtils {
	
	



	private WebDriver driver = null;
	private PageFactory barneys = null;
	

	@Before
	public void setUp() {
		driver = DriverFactory.getInstance("Chrome").getDriver();
		barneys = PageFactory.getInstance();
		
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
	}

	

	@Test
	
	public void test1() {
	
		

	   barneys.homePage().goToLoginPage();
	   
	   barneys.loginPage().login("swapanny79@yahoo.com","shafee13");
		
		
	}
	

	@After
	public void tearDown() {
		
		driver.manage().deleteAllCookies();
		
		DriverFactory.getInstance().removeDriver();
		
	}	
		
		

}
