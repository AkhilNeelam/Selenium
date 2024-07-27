package project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		//Test Case 15->Checking Login Functionality
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ViratKohli21@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Virat@123");
		driver.findElement(By.xpath("//*[@class='primary']")).click();
		
		//Test Case 16->Selecting the product Size,Color
		driver.findElement(By.xpath("//*[@class='product-image-wrapper']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-size-143-item-168']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-color-93-item-50']")).click();
		driver.findElement(By.xpath("//*[@class='action primary tocart']")).click();
		//checking the cart(added or not)
		Thread.sleep(2000);
		//Test Case 17->Checking the Added Cart List of Product
		driver.findElement(By.xpath("//*[@class='action showcart']")).click();

	}

}
