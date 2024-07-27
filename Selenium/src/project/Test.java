package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

		
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		//Test Case 8->Checking Navigation to Mens,Women,Gear 
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id='ui-id-4']"));
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("Tops");
		
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id='ui-id-4']"));
//        dropdown.click();
		
		WebElement navElement = driver.findElement(By.xpath("//*[@id='ui-id-5']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(navElement).perform();
        
        
        
        
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement topsOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Tops")));

        WebElement navElement1 = driver.findElement(By.linkText("Tops")); 
        // Perform mouse hover over "Tops" to reveal further dropdown options
        builder.moveToElement(navElement1).perform();

        // Explicit wait for the Jackets option to be visible
       // WebElement jacketOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Jacket")));
        WebElement navElement11 = driver.findElement(By.linkText("Jackets")); 

        // Click on "Jacket" option in the dropdown
        navElement11.click();
        
        
//        Select select = new Select(navElement);
//		select.selectByVisibleText("Tops");
        
//        WebElement navElement1 = driver.findElement(By.xpath("//*[@aria-activedescendant='ui-id-9']"));
//        Actions builder1 = new Actions(driver);
//        builder1.moveToElement(navElement).perform();
        
        
       
        
        
	}

}
