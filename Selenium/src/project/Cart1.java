package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart1 {

	public static void main(String[] args) {
		private WebDriver driver;

	    // Locators for the login page
	    private By signInLink = By.linkText("Sign In");
	    private By emailField = By.xpath("//*[@id='email']");
	    private By passwordField = By.xpath("//*[@id='pass']");
	    private By loginButton = By.xpath("//*[@class='primary']");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods to interact with the login page
	    public void clickSignIn() {
	        driver.findElement(signInLink).click();
	    }

	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	   
	}

}
