package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		//Validating Page Title
		String expectedTitle="Radio Button & Check Box Demo";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	
		if(expectedTitle.equals(actualTitle)) {
		
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		//Finding Option1 and select 
		driver.findElement(By.xpath("//*[@id='vfb-7-1']")).click();
		Thread.sleep(2000);
		//Finding CheckBox2 and CheckBox3 and Select
		driver.findElement(By.xpath("//*[@id='vfb-6-1']")).click();
		driver.findElement(By.xpath("//*[@id='vfb-6-2']")).click();
		//Selecting Kuwait from country Dropdown
		Thread.sleep(2000);
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown=driver.findElement(By.xpath("//*[@name='country']"));
		Select selectDropdown=new Select(dropdown);
		selectDropdown.selectByVisibleText("KUWAIT"); 
		
		

	}

}
