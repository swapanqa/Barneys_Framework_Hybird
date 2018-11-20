package com.barneys.hybrid_cucumber.qa.framework.pageBase;

import org.openqa.selenium.WebDriver;


import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;

public class PageBase extends SeleniumUtils {
	
	
protected WebDriver driver = null;
	
	
	public PageBase(WebDriver driver) {
		
		
		this.driver =driver;
		
		
	}
	
	
	
	
	
	

}
