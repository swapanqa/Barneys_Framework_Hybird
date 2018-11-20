package com.barneys.hybrid_cucumber.qa.framework.utils;

import com.barneys.hybrid_cucumber.qa.framework.pageLayer.HomePage;
import com.barneys.hybrid_cucumber.qa.framework.pageLayer.LoginPage;
import com.barneys.hybrid_cucumber.qa.framework.pageLayer.RegistrationPage;
import com.barneys.hybrid_cucumber.qa.framework.pageLayer.SearchPage;
import com.barneys.hybrid_cucumber.qa.framework.pageLayer.WomenPage;

public class PageFactory {
	
	private static PageFactory instance = null;
	private HomePage homePage;
	private LoginPage loginPage;
	private RegistrationPage regiPage;
	private SearchPage searchPage;
	private WomenPage womenPage;
	
	private PageFactory() {
	}
	
	public static PageFactory getInstance() {
		if(instance == null) {
			instance = new PageFactory();
		}
		return instance;
	}
	
	public void reset() {
		homePage = null;
		loginPage = null;
	}
	
	public HomePage homePage() {
		if(homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public LoginPage loginPage() {
		if(loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
    
	public RegistrationPage regiPage() {
		if(regiPage == null) {
			regiPage = new RegistrationPage();
		}
		return regiPage;
	}
   
	public SearchPage searchPage() {
		if(searchPage == null) {
			searchPage = new SearchPage();
		}
		return searchPage;
	}
	public WomenPage womenPage() {
		if(womenPage == null) {
			womenPage = new WomenPage();
		}
		return womenPage;
	}
	
	
	
	
	
	
	
	
}
