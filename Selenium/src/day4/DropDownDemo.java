package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//div[@class='_6ltg']//child::a")).click();
		Thread.sleep(2000);
		
		
		//select class for dropdown
		
		//selcting day
		WebElement day=driver.findElement(By.id("day"));
		Select se=new Select(day);
		se.selectByIndex(19); //here we have pass the value less thamn 1 
		
		//selcting month
		Select sel=new Select(driver.findElement(By.id("month")));
		sel.selectByValue("7"); //value always start with 1,so select 7 as july
		
		//selcting year
		Select sel1=new Select(driver.findElement(By.id("year")));
		sel1.selectByVisibleText("2023"); //select the value which is actually visibile in fb application
	}

}
