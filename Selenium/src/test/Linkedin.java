package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com");
			
			driver.findElement(By.xpath("//*[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb oXtfBe-l4eHX']")).click();
			
			// Switch to the Google sign-in popup window
	        String mainWindowHandle = driver.getWindowHandle();
	        for (String windowHandle : driver.getWindowHandles()) {
	            if (!windowHandle.equals(mainWindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='email']")).sendKeys("akhilneelam2017@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
