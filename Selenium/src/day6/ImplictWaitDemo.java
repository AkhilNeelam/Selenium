package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Instead of thread.sleep we are using implict wait so that it will help not to come the exception before before execute
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait time is 10 sends to locate the element,it is wait certain amount of time before throwing exception
		driver.get("https://www.facebook.com/");
		//imcplity is global wait beacuse it will work for all web element
		//thread.sllep will pause the exceution while imcillpit  will not pause the execution
		driver.findElement(By.xpath("//div[@class='_6ltg']//child::a")).click();
		driver.findElement(By.id("firstname")).sendKeys("Akhil");
		

	}

}
