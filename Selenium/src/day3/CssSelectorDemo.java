package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		
		//css is used to locate the web elements
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.cssSelector(".email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector(".password")).sendKeys("xyz@1234");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();


	}

}
