package packages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import packages.Excellib;


public class ReadingXL {
	
	
	@Test
	public void ReadXl() throws Exception {
		

		
		
		Excellib ex=new Excellib();
		String data = ex.readData("hoteloptions", 1, 1);
		System.out.println("the data read is :"+ data);
		
	}
	
	
	
	
	@Test
	public void WriteXl() throws Exception {
		

		
		
		Excellib ex=new Excellib();
		String data = ex.writeData("hoteloptions", 9, 0, "Mumbai");
		System.out.println("the data written is :"+ data);
		
	}
	
	
	
	
	
	
	
	
	

}
