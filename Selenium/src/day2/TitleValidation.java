package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Validating Titile
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
	
		if(expectedTitle.equals(actualTitle)) {
		
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
