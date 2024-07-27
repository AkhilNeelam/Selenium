package day7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is launched");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void enterUrl() {
		System.out.println("url is entered");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	//it will excute 2 times,as test are two

}
