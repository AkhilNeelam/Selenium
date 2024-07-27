package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		boolean emailTextBox=driver.findElement(By.id("email")).isDisplayed();
		
		if(emailTextBox==true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}

		boolean passTextBox=driver.findElement(By.id("pass")).isEnabled();
		if(passTextBox==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		}
		
	}