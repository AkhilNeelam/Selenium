package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailTextBox= driver.findElement(By.id("email")); //here webelement is return type of find element,and web element is interface in selenium
		emailTextBox.getAttribute("text");
		System.out.println(emailTextBox.getAttribute("placeholder"));
		//it gives the locator value eg:placeholdwe value email address or phone number
		
		//get tag name
		System.out.println(emailTextBox.getTagName()); //input tag
		
		
		//get Text method
		WebElement button=driver.findElement(By.linkText("Create new account")); //it returns the text of particular link text box
		System.out.println(button.getText());
		
	}

}
