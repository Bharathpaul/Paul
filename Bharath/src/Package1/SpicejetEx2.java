package Package1;
//count number of checkboxes and get names of checkboxes.

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class SpicejetEx2 {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://spicejet.com/");
				//Maximize window
				driver.manage().window().maximize();
				//wait for few seconds
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				Thread.sleep(4000);
				List<WebElement> spice = driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']/div"));
				int size=spice.size();
				System.out.println("size of checkbox is " + size );
			
				for(int i=0;i<5;i++)		
				{
				System.out.println(spice.get(i).getText());
				
				
				
					
				}
			}
		}

