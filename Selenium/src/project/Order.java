package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Order {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");

		//Test Case 15->Checking Login Functionality
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ViratKohli21@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Virat@123");
		driver.findElement(By.xpath("//*[@class='primary']")).click();
		
		//Test Case 16->Selecting the product Size,Color
		driver.findElement(By.xpath("//*[@class='product-image-wrapper']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-size-143-item-168']")).click();
		driver.findElement(By.xpath("//*[@id='option-label-color-93-item-50']")).click();
		driver.findElement(By.xpath("//*[@class='action primary tocart']")).click();
		//checking the cart(added or not)
		Thread.sleep(2000);
		//Test Case 17->Checking the Added Cart List of Product
		driver.findElement(By.xpath("//*[@class='counter-number']")).click();
		Thread.sleep(2000);
		//Test Case 18->Proceed to CheckOut
		driver.findElement(By.xpath("//*[@id='top-cart-btn-checkout']")).click();
		//Adding Required Details before checkout
		Thread.sleep(5000);
		//Test Case 19->Filling the Address form for the first order
		driver.findElement(By.xpath("//*[@name='street[0]']")).sendKeys("LB Nagar");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.xpath("//*[@name='region_id']"));
        Select selectDropdown = new Select(dropdown);
        
        // Retrieve all options in the dropdown
        List<WebElement> options = selectDropdown.getOptions();
        
        boolean optionSelected = false;
        
        
        //Here is the Defeat in Application Sometimes the dropdown shows countries list Indiana and Sometimes it dropdown shows India States
        //Code for Both the cases
        // Iterate through the options and select the desired one if available
        for (WebElement option : options) {
            if ("Indiana".equals(option.getText())) {
                selectDropdown.selectByVisibleText("Indiana");
                optionSelected = true;
                break; // Exit loop once the option is selected
            }
        }
        
        // If "Indiana" was not found, try "Assam"
        if (!optionSelected) {
            for (WebElement option : options) {
                if ("Assam".equals(option.getText())) {
                    selectDropdown.selectByVisibleText("Assam");
                    optionSelected = true;
                    break; // Exit loop once the option is selected
                }
            }
        }
        
        if (!optionSelected) {
            // Handle the case where neither "Indiana" nor "Assam" is available
            System.out.println("Neither Indiana nor Assam is available in the dropdown.");
        } else {
            // Proceed to interact with other fields after selecting the dropdown value
            WebElement nextField = until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//*[@name='postcode']"))));// Update locator as needed
            nextField.sendKeys("500089");
        }
		//selectDropdown.selectByVisibleText("");
		//driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys("500089");
		WebElement dropdownm=driver.findElement(By.xpath("//*[@name='country_id']"));
		Select selectDropdownm=new Select(dropdownm);
		selectDropdownm.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@name='telephone']")).sendKeys("500089");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();

	}

	private static WebElement until(ExpectedCondition<WebElement> visibilityOfElementLocated) {
		return null;
	}

}
