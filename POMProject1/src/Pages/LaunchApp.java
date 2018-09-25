package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp {
	public static WebDriver driver;
	
	//Launch Application
	public void launchApp(String browser,String URL)
	{
		if(browser.toUpperCase().equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(URL);
			
		
		}
		
	}
}
