package Package1;

//Open browser navigate to flipkart.com
//1)count number of images
//2)get src of images. 
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FlipkartSrc {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			//maximize window
			driver.manage().window().maximize();
			//wait for few seconds
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			List<WebElement> image=driver.findElements(By.tagName("img"));
			int size=image.size();
			System.out.println("number of images are " +size);
			for(int i=0;i<size;i++)
			{
				System.out.println(image.get(i).getAttribute("src"));
				
			}
			

		}

	}



