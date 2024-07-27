package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaLoginTestCase {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		//Test Case 5->Checking Without Mandatory fields
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ViratKohli21@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//*[@class='primary']")).click();
		//Logout
		driver.findElement(By.xpath("//*[@class='action switch']")).click();
		driver.findElement(By.xpath("//*[@class='authorization-link']")).click();
		
}
}