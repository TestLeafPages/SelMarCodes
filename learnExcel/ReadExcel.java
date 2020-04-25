package learnExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String fileName) throws IOException {
	
		
		XSSFWorkbook wbook = new XSSFWorkbook
				("./data/"+fileName+".xlsx");	// Enter WorkBook
		XSSFSheet sheet = wbook.getSheet("Sheet1"); // Enter into Sheet
		
		int rowCount = sheet.getLastRowNum();		// row Count
		System.out.println(rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();	// column Count
		System.out.println(columnCount);
		
		String[][] data = new String[rowCount][columnCount];
	
		for (int i = 1; i <= rowCount; i++) {	// for Row
			XSSFRow row = sheet.getRow(i); 		// enter specific row 
			
			
			for (int j = 0; j < columnCount; j++) {//for Column

				// enter specific column
				XSSFCell cell = row.getCell(j);
				// read the value from the cell 
				String value = cell.getStringCellValue();
				
				data[i-1][j] = value;
				
				System.out.println(value);
			} 

		}
		return data;

	}

}
