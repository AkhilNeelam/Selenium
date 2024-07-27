package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClk_RightClk {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtbox=driver.findElement(By.id("email"));
		Actions act =new Actions(driver);
		emailTxtbox.sendKeys("Akhil");
		act.doubleClick(emailTxtbox).build().perform();
		
		Thread.sleep(2000);
		act.contextClick(emailTxtbox).build().perform();
	}

}
