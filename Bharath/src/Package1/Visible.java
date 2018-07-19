package Package1;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Visible {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
	driver.get("https://www.bing.com/");
	driver.manage().window().maximize();
	List<WebElement> data=driver.findElements(By.tagName("a"));

	System.out.println("links are" + data.size());
	int count=0;
	for( int i=0;i<data.size();i++) {
		
		//System.out.println("header links are " + data.get(i).getText());
		if(data.get(i).isDisplayed()) {
			count=count+1;
			
		}
		}
	System.out.println("hidden links" + count);

	System.out.println("visible links" + count);

	}
	}


