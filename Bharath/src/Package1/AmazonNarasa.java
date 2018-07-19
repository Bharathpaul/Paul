package Package1;

import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonNarasa {
	public static File file;
	public static FileOutputStream FOS;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		file=new File("D:\\New folder\\Amazon.xlsx");
		FOS = new FileOutputStream(file);
		
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("FastTrack");
		
		
		
		System.setProperty("webdriver.gecko.driver","D:\\\\New folder\\\\chromedriver.exe");
			
			//opens browser
			WebDriver driver=new FirefoxDriver();
			//maximize browser
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=4208a962-69d7-4e13-97e4-2f4dbcc5f36c&ie=UTF8");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("fasttrack");
			
			driver.findElement(By.xpath("//input[@class='nav-input']")).click();
			
			Thread.sleep(3000);
			
			java.util.List<WebElement> product= driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));
			
			System.out.println("Number of Products::: "+product.size());
			
			AmazonNarasa amz=new AmazonNarasa();
			
			for(int i=1;i<=product.size();i++)
			{
			
				java.util.List<WebElement> a= driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li[i]/div//div[@class='a-row a-spacing-none']/div"));
				
				if(a.size()==5) {
				
					String Title=driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li["+i+"]/div/div[@class='a-row a-spacing-none']//div[2]")).getText();
					System.out.println(i+">>"+Title);
					String Price=driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li["+i+"]/div//div[@class='a-row a-spacing-none']/div[3]")).getText();
					System.out.println(">>"+Price);
					amz.writeExcelData(i, Title, Price);
				}
				else {
					String Title=driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li["+i+"]/div/div[@class='a-row a-spacing-none']//div[1]")).getText();
					System.out.println(i+">>"+Title);
					String Price=driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li["+i+"]/div//div[@class='a-row a-spacing-none']/div[2]")).getText();
					System.out.println(">>"+Price);
					amz.writeExcelData(i, Title, Price);
				}
				
			}
			wb.write(FOS);
			FOS.close();
			
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



