package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LumaCreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		//Validating Page Title //Test Case 1
		String expectedTitle="Home Page";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	
		if(expectedTitle.equals(actualTitle)) {
		
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		
		//Test Case 2-Creating New Customer Account
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Create an Account")).click();
		 driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Virat");
		 driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Kohli");
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("ViratKohloi21@gmail.com");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Virat@123");
		 driver.findElement(By.xpath("//*[@id='password-confirmation']")).sendKeys("Virat@123");
		 driver.findElement(By.xpath("//*[@class='action submit primary']")).click();
		 String successMessage = driver.findElement(By.cssSelector(".success-msg span")).getText();
	     Assert.assertEquals(successMessage, "Thank you for registering with Main Website Store.");
	     
	     
		 
	}

}
