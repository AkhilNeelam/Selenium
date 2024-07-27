package project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LumaFeaturesNavigations {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is launched");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test //Test Case 8->Checking navigation in Womens Section
	public void Women() throws InterruptedException, IOException {
		System.out.println("Url is Entered");
		WebElement navElement = driver.findElement(By.xpath("//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")); 
        Actions builder = new Actions(driver);
        builder.moveToElement(navElement).perform();
		Thread.sleep(2000);
		WebElement navElement1 = driver.findElement(By.linkText("Tops")); 
		builder.moveToElement(navElement1).perform();
		WebElement navElement11 = driver.findElement(By.linkText("Jackets")); 
		navElement11.click();
	}
	@Test  //Test Case 9->Checking navigation in Mens Section
	public void Men() throws InterruptedException, IOException {
		System.out.println("Url is Entered");
		WebElement navElement = driver.findElement(By.xpath("//*[@id='ui-id-5']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(navElement).perform();
		Thread.sleep(2000);
		WebElement navElement1 = driver.findElement(By.linkText("Tops")); 
		builder.moveToElement(navElement1).perform();
		WebElement navElement11 = driver.findElement(By.linkText("Jackets")); 
		navElement11.click();
	}
	@Test //Test Case 10->Checking navigation in Gear Section
	public void Gear() throws InterruptedException, IOException {
		System.out.println("Url is Entered");
		WebElement navElement = driver.findElement(By.xpath("//*[@id='ui-id-6']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(navElement).perform();
		Thread.sleep(2000);	
		WebElement navElement2 = driver.findElement(By.linkText("Bags"));  
		navElement2.click();
	}
	@Test //Test Case 11->Checking navigation in Training Section
	public void Training() throws InterruptedException, IOException {
		System.out.println("Url is Entered");
		driver.findElement(By.xpath("//*[@id='ui-id-7']")).click();
	}
	@Test //Test Case 12->Checking navigation in Sale Section
	public void Sale() throws InterruptedException, IOException {
		System.out.println("Url is Entered");
		driver.findElement(By.xpath("//*[@id='ui-id-8']")).click();
	}
	
	
	
	@AfterMethod
	public void close() throws InterruptedException {
		System.out.println("closing the application");
		Thread.sleep(5000);
		driver.close();
	

}}
