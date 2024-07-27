package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityandExclipt {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//here imclipt will wait for page to load i.e 10 secounds
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//here it will wait for 20 secoiunds to wait for elements to be loacted i.e correct email loactor or not //exclict will check thwe condition
		//here is the disadvantage of imacipt will wait for 10 secounds after that exclpit will start  waiting  
		//in this program it wait for 20 secounds consider maximum wait time 
		//rec-24-06-24
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("Akhil"); 

	}

}
