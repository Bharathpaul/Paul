package Package1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write1 {
		public static File file;
		public static FileOutputStream FOS;
		public static XSSFWorkbook wb;
		public static XSSFSheet sheet;

		public static void main(String[] args) throws IOException {
			
			//write the data into workbook
			file=new File("D:\\Book1.xlsx");
			FOS = new FileOutputStream(file);
			
			wb=new XSSFWorkbook();
			sheet=wb.createSheet("Names1");
			
			Write1 exr = new Write1();
			exr.writeExcelData(0, "Venkata", "Krishna");
			exr.writeExcelData(1, "Venkata1", "Krishna1");
			exr.writeExcelData(2, "Venkata2", "Krishna2");
			
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
