package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//open browser
		driver.get("https://www.bing.com/");
		//maximize browser
		driver.manage().window().maximize();
		//wait for few seconds
		Thread.sleep(4000);
		List<WebElement> bing= driver.findElements(By.xpath("//div[@class='sw_tb']/ul/li"));
		int size=bing.size();
		System.out.println("number of links" +size);
		int i;
		for(i=0;i<9;i++)
		{
			System.out.println(bing.get(i).getText());
			Thread.sleep(6000);
			
		}
		
		
		

	}

}
