package PagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAppPF {
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
	
	public void closeApp()
	{
		driver.quit();
	}
}
