package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//
		driver.findElement(By.id("email")).sendKeys("9502741480");
		//clear method
		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.name("pass")).sendKeys("Akhil@2001");
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Create new account")).click();

	}

}
