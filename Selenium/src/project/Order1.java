package project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Order1 {

	//Run the Order Program Before Running Order1(If you are new user need new address delivery)
	//As Order program As Address filed we can modify the address
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ViratKohli21@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Virat@123");
		driver.findElement(By.xpath("//*[@class='primary']")).click();
		driver.findElement(By.xpath("//*[@class='product-image-wrapper']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-size-143-item-168']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-color-93-item-50']")).click();
		driver.findElement(By.xpath("//*[@class='action primary tocart']")).click();
		//checking the cart(added or not)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='counter-number']")).click();
		Thread.sleep(2000);
		//Test Case 21->Selcting the Address and click on Continue
		driver.findElement(By.xpath("//*[@id='top-cart-btn-checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();
		Thread.sleep(3000);
		//Test Case 22->Check for payment and click on Continue
		driver.findElement(By.xpath("//*[@class='action primary checkout']")).click();
		Thread.sleep(2000);
		//Test Case 23->Taking Screenshot order id 
		Thread.sleep(2000);
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File location=new File("C://Selenium//Selenium//Screenshot//screenshot1.png");
			
			Files.copy(screenshot, location);
		Thread.sleep(2000);
		//Click on Continue Shopping
		driver.findElement(By.xpath("//*[@class='action primary continue']")).click();
		
		driver.quit();
		
		

		
		

	}

}
