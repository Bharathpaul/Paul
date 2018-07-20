package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaqToSelenium {
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://onlineqaclasses.com/");
			//Wait for 4 seconds
			Thread.sleep(4000);
			//maximize browser
			driver.manage().window().maximize();
			//Wait based on the element
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			driver.findElement(By.xpath("//*[@id=\"start_nicdark_framework\"]/div[2]/div[1]")).click();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"menu-item-487\"]/a/span[2]"));
			Thread.sleep(4000);
			Actions a = new Actions(driver);	

		}

	}



