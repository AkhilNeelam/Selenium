package day5;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		Thread.sleep(2000);
		//find how many frames
		List<WebElement> totalFrames= driver.findElements(By.tagName("frame"));
		System.out.println("Total no of Frames" +totalFrames.size());
		//handling iframe by index method
		driver.switchTo().frame(0); //first way
		
//		//handling i frame using name or id method
//		driver.switchTo().frame("packageListFrame"); //secound way 
//		
		//third way by creating frame using webelement method
//		WebElement frame=driver.findElement(By.name("packageListFrame"));
//		driver.switchTo().frame(frame);
		
		driver.findElement(By.linkText("java.applet")).click();
		//switching one frame to another
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Applet")).click();
		//driver.switchTo().parentFrame()
		
		

	}

}
