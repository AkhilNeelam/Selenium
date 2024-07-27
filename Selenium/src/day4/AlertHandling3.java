package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Alert aq=driver.switchTo().alert();
		System.out.println(aq.getText());
		Thread.sleep(2000);
		aq.sendKeys("Virat");
		aq.accept();
		
	}

}
