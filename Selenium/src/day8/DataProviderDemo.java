package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@Test
	public void launchBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
	}
	
	@Test(dataProvider="dataset")
	public void login(String un,String pass) {
		System.out.println(un+"===>"+pass);
		
		driver.findElement(By.name("user-name")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click(); 
	}
	
	@DataProvider (name="dataset")
	public Object[][] dpMethod() {
		return new Object [] [] {
			{"standard_user","secret_sauce"},{"xyz","abc123"}
		};
	}

}
// "dataset"): This annotation defines a data provider named "dataset". It provides a 2D array of Object containing test data.