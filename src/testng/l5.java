package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class l5 {   

	
	public static void main(String[] args) throws IOException
 {
		FileInputStream f = new FileInputStream("./testdata/l1.xlsx") ;
		   XSSFWorkbook b  = new XSSFWorkbook(f);
		XSSFSheet s =   b.getSheetAt(0);
		
		for(int i = 0;i<= s.getLastRowNum();i++) {
			 XSSFRow row = s.getRow(i);
			 if(row != null) {

	                for (int j = 0; j < row.getLastCellNum(); j++) {
				 	 XSSFCell c = row.getCell(j) ;
				 	 if(c != null) {
				 		 String Value = c.toString();
				 		 System.out.println(Value);
				 		 
				 	 }
				 }
			 }
		}
		b.close();
		f.close();
		}
}
