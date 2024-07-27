package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3 {
	
WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is launched");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@DataProvider(name = "loginData")
    public Object[][] dataProvider() {
        return new Object[][] {
            {"user1", "password1"},
            {"user2", "password2"},
            {"user3", "password3"}
        };
    }
	 @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) {
	        System.out.println("Logging in with username: " + username + " and password: " + password);
	        
	        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
	        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@name='SubmitLogin']")).click();
	    }
	 @AfterMethod
		public void close() throws InterruptedException {
			System.out.println("closing the application");
			Thread.sleep(5000);
			driver.close();
		}
	 

}
