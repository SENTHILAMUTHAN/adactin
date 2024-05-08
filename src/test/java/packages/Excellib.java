package packages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excellib {
	
	
	XSSFWorkbook wb;
	
	
	Sheet sheet;
	
	
	public Excellib() throws IOException {
		
		
		File f= new File("D:\\Eclipse\\Adactin\\testdata\\adactindata.xlsx");
		
		FileInputStream FIS= new FileInputStream(f);
		 
	    
		wb= new XSSFWorkbook(FIS);
		
		
	}
	
	
	public String readData(String Sheetname, int row , int col) {
		sheet =wb.getSheet(Sheetname);
		
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	   public String writeData(String Sheetname, int row, int col, String data) throws IOException {
		   
		   File f= new File("D:\\Eclipse\\Adactin\\testdata\\adactindata.xlsx");
	        sheet = wb.getSheet(Sheetname);
	        
	        Row excelRow = sheet.getRow(row);
	        if (excelRow == null) {
	            excelRow = sheet.createRow(row);
	        }
	        Cell cell = excelRow.createCell(col);
	        cell.setCellValue(data);
	        FileOutputStream FOS = new FileOutputStream(f);
	        wb.write(FOS);
	        FOS.close(); // Don't forget to close the output stream
			return data;
	        
	    }

	
	
	
	
	
}
