package com.barneys.hybrid_cucumber.qa.framework.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;

public class WomenPage extends SeleniumUtils {
	
	public WomenPage() {
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[5]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement womenlink;
	
	@FindBy(xpath="//*[@id=\"topnav-level-1\"]/li[3]/div/div/div[1]/ul/li[3]/ul/li[1]/a")
	private WebElement boots;
	
	
	public void hoverAction() {
		Actions action = new Actions(driver);
		action.moveToElement(womenlink).build().perform();
		
	}
	
	public void bootlink() {
		boots.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
