package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.linkText("HOTELS")).click();
		System.out.println(driver.getTitle());
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allwindows =driver.getWindowHandles();
		System.out.println(allwindows.size());
		System.out.println(allwindows);
		
		Iterator itr =allwindows.iterator();
		while(itr.hasNext()) {
			String childWindow=(String) itr.next();
			if(!parentwindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.linkText("Bus Tickets")).click();
				Thread.sleep(2000);	
				System.out.println(driver.getTitle());
				driver.close();
			}
 }
		driver.quit();

	}

 }
