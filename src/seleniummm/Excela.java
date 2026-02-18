package seleniummm;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excela {

	
	public static Object[][] readE(String location ){
		
		Object[][] data = null;
		
		
		try {
			FileInputStream fi = new FileInputStream(".\\testdata\\" + location + ".xlsx");
			Workbook w = new XSSFWorkbook(fi);
			Sheet s = w.getSheet("Sheet1");
			
			int r = s.getPhysicalNumberOfRows();
			int c = s.getRow(0).getPhysicalNumberOfCells();
			
			data = new Object[r-1][c];
			
			for(int i = 1;i<r;i++) {
				for(int j = 0;j<c;j++) {
					data[i-1][j] = s.getRow(i).getCell(j).toString();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
