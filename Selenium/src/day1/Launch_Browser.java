package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		//to automate the web applocation->opening the browser
		WebDriver driver = new ChromeDriver(); //Ctrl+Shift+O
		//here webdriver is a interface,child class chrome driver for creating insyance of web driver
		
//		web driver=>Intrface
//				driver =instance of web driver
//				new->keyword
//				chromedriver->class

		driver.manage().window().maximize(); //for maximize the browser
		//for pausing the execution for 2sec
		Thread.sleep(2000); //we need to throws the exception,here 2000 millisecounds
		//to close
		driver.close();
	}

}
