package project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class LumaScroll {
	
	private WebDriver driver;
//Test Case 6-Scroll Up and Down    

    @BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is launched");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
		
		@Test
		public void Login() throws InterruptedException, IOException {
			System.out.println("Url is Entered");
			driver.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(2000);
			//scroll down
			JavascriptExecutor js=(JavascriptExecutor) driver;//typecasting if we are  using two interface at at time uing web element reference driver
			//Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,400)", "");//here we are scrolling the facebook page to y axis so x axis means upper,y axis is lowe ,bascically pixels 400 to y axis
			//scroll up
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-400)", "");

			 //Test Case 7-Screenshot of the page
			 //Screenshot
		        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        File location=new File("C://Selenium//Selenium//Screenshot//screenshot.png");
				
				Files.copy(screenshot, location);

}
		 @AfterMethod
			public void close() throws InterruptedException {
				System.out.println("closing the application");
				Thread.sleep(5000);
				driver.close();
			}
}