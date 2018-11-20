package com.barneys.hybrid_cucumber.qa.framework.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.barneys.hybrid_cucumber.qa.framework.pageBase.PageBase;
import com.barneys.hybrid_cucumber.qa.framework.utils.DriverFactory;
import com.barneys.hybrid_cucumber.qa.framework.utils.SeleniumUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;



public class SearchPage extends SeleniumUtils {
	
	
	
	@FindBy(xpath="//input[@id='atg_store_searchInput']")
	private WebElement searchButton;
	
	@FindBy(xpath="//h1[@class='browse-title hidden-xs']")
	private WebElement resultText;
	
	
	
	
	
	
	public SearchPage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void searchItem() {
		
		searchButton.click();
		
		
		
		
	}
  
	public void  verifySearchText(String expectedResult) {
		
		String result = resultText.getText();
		assertThat(result, startsWith(expectedResult));
		
	}
	

	

	public void verifySearchPageTitle(String expectedTitle) {
		
		String title = DriverFactory.getInstance().getDriver().getTitle();
		
		assertThat(title ,startsWith(expectedTitle));
		
		
	}
	
	
	
	
	
	
	

}
