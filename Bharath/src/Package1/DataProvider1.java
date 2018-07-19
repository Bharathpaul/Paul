package Package1;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataProvider1 {


			XSSFWorkbook wb;
			XSSFSheet ws;
			

			public DataProvider1() throws IOException
			{
				 File excel = new File("D:\\New folder\\FLIPKART.xlsx");
					FileInputStream fis = new FileInputStream(excel);

					wb = new XSSFWorkbook(fis);
					ws = wb.getSheetAt(0);

					
			}
			
			
			public int readExcel(int rownum,int colnum)
			{
					XSSFRow row = ws.getRow(rownum);
					XSSFCell cell = row.getCell(colnum);
				    int value = (int) cell.getNumericCellValue();
					System.out.println("The value is" +"\t"+ value);
					return value;
			}
			
			@Test(dataProvider="add1")
			public void addition1(int a,int b,int exp)
				{
					int c;
					c=a+b;
					Assert.assertEquals(c, exp);
					
	/*				Assert.assertTrue(11);
					Assert.assertFalse(11);
					Assert.fail(message);
					Assert.*/
				}
			
			
			@DataProvider(name="add1")
			public Object[][] data1() throws IOException
			{
				DataProvider1 dpe = new DataProvider1();
				
				int rowcount = ws.getPhysicalNumberOfRows();
				
				Object[][] obj=new Object[rowcount-1][3];
				
				for(int i=0;i<rowcount-1;i++)
				{
					
					int first = dpe.readExcel(i+1, 0);
					int second = dpe.readExcel(i+1, 1);
					int third = dpe.readExcel(i+1, 2);
					
					
					obj[i][0] =  first;
					obj[i][1] =  second;
					obj[i][2] =   third;
				}
				
				return obj;
			}

		}



	


