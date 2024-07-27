package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//Retrieve all company names
		WebElement table = driver.findElement(By.className("dataTable"));
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		java.util.List<String> countries = new java.util.ArrayList<>();
		
		 for (int i = 1; i < rows.size(); i++) {
	            // Find the country name in the first column
	            WebElement countryElement = rows.get(i).findElement(By.tagName("td"));
	            String country = countryElement.getText().trim();
	            countries.add(country);
		 }
	            
	     for (String country : countries) {
	                System.out.println(country);
	            }
	     
	     Thread.sleep(5000);
	     //Assignment 2
	     driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	     driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("1234");
	     driver.findElement(By.xpath("//*[@name='submit']")).click();
	     //Alert
	     Alert al=driver.switchTo().alert();
	     String alertText=al.getText();
	     System.out.println(alertText);
	     Thread.sleep(2000);
	     al.accept();

	     //Alert 2
	     Alert all=driver.switchTo().alert();
	     String alertTextt=al.getText();
	     System.out.println(alertTextt);
	     Thread.sleep(2000);
	     al.accept();
	     
	     //Assignment 3
	     Thread.sleep(5000);
	     driver.navigate().to("https://jqueryui.com/");
	     driver.findElement(By.linkText("Draggable")).click();
	     WebElement iframeElement = driver.findElement(By.cssSelector("iframe.demo-frame"));
	     //WebElement iframeElement=driver.findElement(By.xpath("//*[@class='demo-frame']"));)
	     driver.switchTo().frame(iframeElement);
	     
	     WebElement draggable = driver.findElement(By.id("draggable"));
	     Actions actions = new Actions(driver);
	        actions.dragAndDropBy(draggable, 150, 100).perform();
	     //Screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File location=new File("C://Selenium//Selenium//Screenshot//screenshot.png");
			
			Files.copy(screenshot, location);
	     

	}
	
	
	

}
