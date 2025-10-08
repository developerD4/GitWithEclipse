package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.TestBase;

public class LoginTest extends TestBase{
	@Test
	public void onTest() {
		
	LoginPage loginPage = new LoginPage(getDriver());
	
	loginPage.open();
	loginPage.login("standard_user", "secret_sauce");
	
	HomePage hp = new HomePage(getDriver());
	
	Assert.assertTrue(hp.isCartIconDisplayed(),"Cart icon should be visible after login");
	Assert.assertEquals(hp.getPageTitle(), "Products");
	
	}
}
