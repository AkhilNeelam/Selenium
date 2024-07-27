package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		WebElement checkBox1=driver.findElement(By.id("isAgeSelected"));
		checkBox1.click();
		if(checkBox1.isSelected()==true) {
			System.out.println("check box is slected");
		}
		else {
			System.out.println("Not selcted");
		}
		

	}

}
