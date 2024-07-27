package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LumaCreateNewTestCase {

	public static void main(String[] args) {WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	//Test Case 3- Testing without mandatory fields
	driver.findElement(By.linkText("Create an Account")).click();
	 driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Virat");
	 driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Kohli");
	 driver.findElement(By.xpath("//*[@name='email']")).sendKeys();
	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("");
	 driver.findElement(By.xpath("//*[@id='password-confirmation']")).sendKeys("");
	 driver.findElement(By.xpath("//*[@class='action submit primary']")).click();
	 String successMessagee = driver.findElement(By.cssSelector(".success-msg span")).getText();
    Assert.assertEquals(successMessagee, "Thank you for registering with Main Website Store.");

	}

}
