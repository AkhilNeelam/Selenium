package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchOption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		//Test Case 13->Testing Search Functionality
		WebElement searchField=driver.findElement(By.xpath("//*[@id='search']"));
		searchField.sendKeys("T Shirts");
        searchField.submit();
        //Test Case 14->testing Sort Functionality
        Thread.sleep(2000);
        WebElement priceFilter = driver.findElement(By.xpath("//*[@id='sorter']"));
        Select priceDropdown = new Select(priceFilter);
        priceDropdown.selectByVisibleText("Price");
        
		//Scroll the page to end
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
        
        
  

		
    }

}