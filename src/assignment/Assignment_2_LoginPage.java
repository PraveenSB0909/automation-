package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment_2_LoginPage {
	  private WebDriver driver;
	    
	    // Locators for the login page elements
	    private By usernameField = By.xpath("//input[@name='username']");
	    private By passwordField = By.xpath("//input[@name='password']");
	    private By loginButton = By.xpath("//button[@type='submit']");
	    private By errorMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

	    // Constructor to initialize the driver
	    public Assignment_2_LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to set username
	    public void setUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    // Method to set password
	    public void setPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    // Method to click login button
	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }

	    // Method to perform login
	    public void login(String username, String password) {
	        setUsername(username);
	        setPassword(password);
	        clickLoginButton();
	    }

	    // Method to retrieve error message text
	    public String getErrorMessage() {
	        return driver.findElement(errorMessage).getText();
	    }
	
}

