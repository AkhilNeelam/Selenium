package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//to count links 
		
	 List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	 System.out.println(allLinks.size());
	 
	 for(int i =0;i<allLinks.size();i++)
	 {
		 String Link=allLinks.get(i).getText();
		 
		 if(Link.startsWith("M")) {
			 System.out.println(Link);
		 }
	 }
	 

	}

}
