package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement books=driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(books).build().perform();
		
		//mouse hover forsecound element
		WebElement Computers=driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(Computers).build().perform();

		
		
		

	}

}
