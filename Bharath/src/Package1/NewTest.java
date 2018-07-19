package Package1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void f() {
  }
  WebDriver driver=new ChromeDriver();
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.cgrome.driver","D:\\New folder\\chromedriver.exe");
	  driver.get("https://www.flipkart.com/");driver.manage().window().maximize();
  }
   @Test
   public void login()
   { 
   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("BHarath");
   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
}
}
