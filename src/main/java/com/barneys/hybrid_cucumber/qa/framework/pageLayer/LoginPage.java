package com.barneys.hybrid_cucumber.qa.framework.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;


public class LoginPage extends SeleniumUtils {
	
	

	@FindBy(xpath="//input[@id='atg_store_registerLoginEmailAddress']")
    private WebElement emailTextBox;
	
	@FindBy(xpath="//input[@id='atg_store_registerLoginPassword']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@id='atg_store_loginButton']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[@class='error']")
	private WebElement errorMessage;
	
	@FindBy(xpath="//span[@class='icon dropdown-toggle hidden-xs dropdown-button a11y-return']]")
	private WebElement singOutButton;
	
	public LoginPage() {
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void setEmailAddress(String emailsetup) {
		//emailTextBox.clear();
		emailTextBox.sendKeys(emailsetup);
		delayFor(5000);
	}
	
	public void setPassword(String passwordsetup) {
		//passwordTextBox.clear();
		passwordTextBox.sendKeys(passwordsetup);
		delayFor(2000);
		
	}
	
	public void clickLogin() {
		loginButton.submit();
		delayFor(2000);
	}
	
	public void login(String email,String Password) {
		
		setEmailAddress(email);
		setPassword(Password);
		clickLogin();
		delayFor(3000);
	}
	
	public void clickSingOut() {
		
		singOutButton.click();
		delayFor(2000);
	}
	
	
public void verifyPageTitle() {
	
	String title = DriverFactory.getInstance().getDriver().getTitle();
	assertThat(title, startsWith("Luxury Designer Handbags, Shoes and Clothing | Barneys New York"));
	
}

public void verifyLoginError(String expectedmsg) {
	String msg = errorMessage.getText();
	assertThat(msg, startsWith(expectedmsg));
	delayFor(2000);
}

	
	
	
	
	
	
	
	
	
	
	
	

}
