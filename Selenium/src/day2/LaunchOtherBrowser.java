package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchOtherBrowser {

	public static void main(String[] args) {
		//launching firefox 
		WebDriver Driver =new FirefoxDriver();
		Driver.manage().window().maximize();
		
		//launch edge browser
		
		WebDriver driver1=new EdgeDriver();
	}

}
