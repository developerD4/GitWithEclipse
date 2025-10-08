package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id = "user-name")
	private WebElement userNameId;
	
	@FindBy(id = "password")
	private WebElement passwordId;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String username) {
		userNameId.sendKeys(username);
	}
	public void enterPassword(String password) {
		passwordId.sendKeys(password);
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void open() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
}
