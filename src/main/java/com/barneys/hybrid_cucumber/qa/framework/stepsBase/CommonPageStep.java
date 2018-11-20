package com.barneys.hybrid_cucumber.qa.framework.stepsBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PropertyReaderService;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonPageStep  {
	
	protected WebDriver driver = DriverFactory.getInstance(PropertyReaderService.getInstance().getProperty("BROWSER")).getDriver();
	
	

	@Before
	public void setUp() {
		
		driver = DriverFactory.getInstance("chrome").getDriver();
		
		
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		
		driver.manage().deleteAllCookies();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
		DriverFactory.getInstance().removeDriver();
		
	}
	
	@Given("Not a validated user")
	public void not_a_validated_user() {
		driver.manage().deleteAllCookies();
	}

	@When("User browse to the site")
	public void user_browse_to_the_site() {
	    driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
