package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//for alert
		driver.findElement(By.xpath("//div[@class='pwdpass']//child::input[2]")).click();
		
		Alert al=driver.switchTo().alert();
		String alertText=al.getText();//for getting a text of an alert
		System.out.println(alertText);
		Thread.sleep(2000);
		al.accept();//accpet the alert
		
		

	}

}
