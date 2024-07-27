package day3;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/");
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		List<WebElement> allImg=driver.findElements(By.tagName("img"));
		
		if(allLinks.size()>allImg.size()) {
			System.out.println("Links are greater than images");
		}
		else {
			System.out.println("Images are greater");
		}
		
		
	}

}
