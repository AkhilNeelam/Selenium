package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		int rows=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println("Total rows"+rows);
		int coloums=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println("Total coloums"+coloums);
		
		//Printing whole table data
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=5;c++) {
			String Value= driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td["+c+"]")).getText();
			System.out.println(Value);
			}
		}
		
	}

}
