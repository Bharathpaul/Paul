package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bingurl2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> url=driver.findElements(By.tagName("a"));
		System.out.println("the limks are "+url);
		for(int i=0;i<url.size();i++)
		{
			System.out.println("header links are " + url.get(i).getText());
			
		}
		

	}

	}

