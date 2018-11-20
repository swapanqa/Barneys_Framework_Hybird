package com.barneys.hybrid_cucumber.qa.framework.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;


public class HomePage extends SeleniumUtils {
	
	@FindBy(xpath="//a[@title='Log in to your account']")
	private WebElement loginLink;
	
	
	@FindBy(xpath="//a[@title='Create an Account']")
	private WebElement registerLink;
	
	
	@FindBy(xpath="//span[@class='my-bag-icon']")
	private WebElement myBagLink;
	
	@FindBy(xpath="//a[@class='search']")
	private WebElement searchLink;
	
	@FindBy(xpath="//a[contains(@class,'accord-header')][contains(text(),'TRUNKED')]")
	private WebElement trunkedLink;
	
	@FindBy(xpath="//*[@id=\"atg_store_prodList\"]/ul/li[2]/div/div[3]/div[1]/a")
	private WebElement brandLink;
	
	public HomePage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	public void brandItem() {
		
		brandLink.click();
	}
	
	public void goToLoginPage() {
		loginLink.click();
		
	}
	
	public void goToRegisterPage() {
		
		registerLink.click();
	}
	
	
	public void goToMyBagPage() {
		
		myBagLink.click();
		
	}
	
	public void goToSearchPage() {
		
		searchLink.click();
	}
	
	
public void goToTrunkedPage() {
	trunkedLink.click();
	
	
	
}
}
