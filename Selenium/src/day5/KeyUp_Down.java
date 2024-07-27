package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_Down {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtbox=driver.findElement(By.id("email"));
		Actions act =new Actions(driver);
//		act.keyDown(emailTxtbox,Keys.CONTROL).build().perform();
//		emailTxtbox.sendKeys("Akhil");
//		act.keyDown(emailTxtbox,Keys.CONTROL).build().perform();
		
		act.moveToElement(emailTxtbox).click().keyDown(Keys.SHIFT).sendKeys("akhil").build().perform();
		
		
		
		
		

	}

}
