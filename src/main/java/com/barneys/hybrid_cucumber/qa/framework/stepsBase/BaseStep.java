package com.barneys.hybrid_cucumber.qa.framework.stepsBase;

import org.openqa.selenium.WebDriver;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.PropertyReaderService;



public class BaseStep {
	
	protected WebDriver driver = DriverFactory.getInstance(PropertyReaderService.getInstance().getProperty("BROWSER")).getDriver();
	
	

}
