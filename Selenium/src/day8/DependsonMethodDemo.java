package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsonMethodDemo {
	
	WebDriver driver;
	@Test
	public void register() {
		System.out.println("register method");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Virat");
		driver.findElement(By.id("LastName")).sendKeys("Kohil");
		driver.findElement(By.id("Email")).sendKeys("abc@rediffmailf.com");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc@123");
		//driver.findElement(By.id("register-button")).click();
		
		
	}
	@Test (dependsOnMethods="register")
	public void login() {
		System.out.println("login method");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc@rediffmailf.com");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
