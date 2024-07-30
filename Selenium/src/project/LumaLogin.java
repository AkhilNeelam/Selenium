package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LumaLogin {

		public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		//Test Case 4->Checking Login Functionality
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ViratKohli21@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Virat@123");
		driver.findElement(By.xpath("//*[@class='primary']")).click();
		//Logout
		driver.findElement(By.xpath("//*[@class='action switch']")).click();
		driver.findElement(By.xpath("//*[@class='authorization-link']")).click();

		//Teest Case 5->Checking the Logo
		WebElement img=driver.findElement(By.xpath("//a[@class='logo']//img"));
		System.out.println("The logo is :"+img.isDisplayed());
		
		
		
	}

}
