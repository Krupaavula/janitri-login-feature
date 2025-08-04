package tests;

	import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.UtilityPage;

	public class Logintest extends UtilityPage {

	    @Test
	    public void testLoginButtonDisabledWhenFieldAreEmpty() {
	        Loginpage loginPage = new Loginpage(driver);
	        System.out.println("Is login button enabled? ➤ " + loginPage.isLoginButtonEnabled());

	        Assert.assertTrue(loginPage.isLoginButtonEnabled(), "Login button should be disabled when fields are empty");
	    }

	    @Test
	    public void testPasswordMaskedbutton() {
	        Loginpage loginPage = new Loginpage(driver);

	        System.out.println("Before click: password field type = " + loginPage.getPasswordFieldType());

	        Assert.assertEquals(loginPage.getPasswordFieldType(), "password", "Password should be masked");

	        loginPage.clickEyeIcon();

	        System.out.println("After click: password field type = " + loginPage.getPasswordFieldType());

	        Assert.assertEquals(loginPage.getPasswordFieldType(), "text", "Password should be visible after clicking eye icon");
	    }


	    @Test
	    public void testInvalidLoginShowErrorMsg() throws InterruptedException {
	        Loginpage loginPage = new Loginpage(driver);
	        loginPage.enterUserId("randomUser");
	        loginPage.enterPassword("randomPass");

	        
	        System.out.println("Clicking login with invalid credentials...");

	        loginPage.clickLogin();

	        
	        String pageText = driver.getPageSource().toLowerCase();

	        System.out.println("Page text contains: " + pageText.substring(0, Math.min(500, pageText.length())));

	        Assert.assertTrue(pageText.contains("invalid") || pageText.contains("error"),
	                "Expected error message not found for invalid login.");
	    }

	}

	


