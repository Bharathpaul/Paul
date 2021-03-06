

	

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.util.SystemOutLogger;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class fLIPKART2 {

		public static File file;
		public static FileOutputStream FOS;
		public static XSSFWorkbook wb;
		public static XSSFSheet sheet;
		
		public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException {


			//write the data into workbook
			file=new File("D:\\New folder\\FLIPKART1.xlsx");
			FOS = new FileOutputStream(file);
			
			wb=new XSSFWorkbook();
			sheet=wb.createSheet("FLIPKART");
			
			
			
			
			
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			//wait for few seconds
			Thread.sleep(3000);
			
			//Maximize browser
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			if(driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).isDisplayed())
			{
				driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
			}
			
			//Using Actions,electrons -->DSLR
			WebElement Elec = driver.findElement(By.xpath("//span[text()='Electronics']"));
			//WebElement DSLR = driver.findElement(By.xpath("//span[text()='DSLR']"));
			
			WebElement DSLR = driver.findElement(By.xpath("//span[text()='Sports & Action']"));
			
			
			
			Actions a =new Actions(driver);
			a.moveToElement(Elec).pause(3000).moveToElement(DSLR).pause(2000).click().build().perform();
			int counter=0;
			int rowCount=1;
			
			try
			{
			do {
						if(counter>0)
						{
							driver.findElement(By.xpath("//span[text()='Next']")).click();
						}
				
						Thread.sleep(3000);
						List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"container\"]//div[@class='_1HmYoV _35HD7C col-10-12']/div"));
						
						//Creating a object to the class
						fLIPKART2  fke=new fLIPKART2();
						
						
						
						//Size of elements
						int size = elements.size();
						
						for(int i=2;i<size;i++)		
						{
							rowCount=rowCount+1;
								//Read the DSLR Camera Name
								String text = driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='_1HmYoV _35HD7C col-10-12']/div["+i+"]//div[@class='_3wU53n']")).getText();
								System.out.println(rowCount-1 +":: The item DSLR name is "+ text);
								
								//Price
								String price = driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='_1HmYoV _35HD7C col-10-12']/div["+i+"]//div[@class='_1vC4OE _2rQ-NK']")).getText();
								System.out.println(rowCount-1 +"::Items price is "+ price);
								fke.writeExcelData(rowCount-2, text, price);
						}	
						
						counter++;
			}while(driver.findElement(By.xpath("//span[text()='Next']")).isEnabled());	
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println("Thanks.All the elements are completed...");
			}
			wb.write(FOS);
			FOS.close();
			
			driver.quit();
			
			}
		
		public void writeExcelData(int rowno,String col1,String col2)
		{
			XSSFRow row=sheet.createRow(rowno);
			XSSFCell cell = row.createCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(col1);
			
			XSSFCell cell1 = row.createCell(1);
			cell1.setCellType(cell1.CELL_TYPE_STRING);
			cell1.setCellValue(col2);
		}

	}



