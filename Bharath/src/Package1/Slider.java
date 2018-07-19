package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		//wait for 4 seconds
		Thread.sleep(4000);
		//Maximize window
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
		//Wait based on the element
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.switchTo().frame(0);
		//Locate the element
		WebElement elementtodrop=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		a.dragAndDropBy(elementtodrop, 550, 0).build().perform();
		
		
		
		
		
	}

}
