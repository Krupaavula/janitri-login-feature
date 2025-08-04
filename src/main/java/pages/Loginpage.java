package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	

	    WebDriver driver;

	   
	    private By userIdField = By.id("formEmail");
	    private By passwordField = By.id("formPassword");
	    private By loginButton = By.xpath("//button[@type='submit']");
	    private By eyeIcon = By.xpath("//img[@class='passowrd-visible']");

	    public Loginpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUserId(String userId) {
	        driver.findElement(userIdField).sendKeys(userId);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

	    public boolean isLoginButtonEnabled() {
	        return driver.findElement(loginButton).isEnabled();
	    }

	    public void clickEyeIcon() {
	        driver.findElement(eyeIcon).click();
	    }

	    public String getPasswordFieldType() {
	        return driver.findElement(passwordField).getAttribute("type");
	    }
	}

	
	
	
	
	

