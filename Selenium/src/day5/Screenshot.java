package day5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takescrrenshot interface
		File location=new File("C://Selenium//Selenium//Screenshot//Demo.png");
		
		Files.copy(screenshot, location);
		
	}

}
