package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(className = "title")
	private WebElement pageTitle;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cartIcon;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isCartIconDisplayed() {
		return cartIcon.isDisplayed();
	}
	
	public String getPageTitle() {
		System.out.println(driver.getTitle());
		return pageTitle.getText();
	}
}
