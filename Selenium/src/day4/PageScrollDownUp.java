package day4;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollDownUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor) driver;//typecasting if we are  using two interface at at time uing web element reference driver
		//Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");//here we are scrolling the facebook page to y axis so x axis means upper,y axis is lowe ,bascically pixels 400 to y axis
		//scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)", "");

		

	}

}
