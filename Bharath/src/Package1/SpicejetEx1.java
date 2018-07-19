package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//)Open browser navigate to "spicejet.com" and click onstudent checkbox and conform whether it is working or not.

public class SpicejetEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")).isEnabled());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
