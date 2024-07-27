package day7;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TestNG4 {
	/*BeforeSuite
	 * @Test
	 * @test2
	 * After suite
	 * 
	 * 
	 */
		WebDriver driver;
		
		@BeforeSuite
		public void launchBrowser() {
			System.out.println("Browser is launched");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterSuite
		public void closeBrowser() {
			System.out.println("Browser is Closed");
		}
		@Test
		public void Login() throws InterruptedException {
			System.out.println("Url is Entered");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			//confirm once login
			String expectedText="Dashboard";
			String actualText=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
//			if(expectedText.equals(actualText)) {
//				System.out.println("testcase is pass");
//			}
//			else {
//				System.out.println("fail");
//			}
			Assert.assertEquals(expectedText, actualText);
			}
		@Test
		public void logout() {
			System.out.println("logout method");
		}
	}


