package learnExcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {

		
		XSSFWorkbook wbook = new XSSFWorkbook
				("./data/TC001_CreateLead.xlsx");	// Enter WorkBook
		XSSFSheet sheet = wbook.getSheet("Sheet1"); // Enter into Sheet
		int rowCount = sheet.getLastRowNum();		// row Count
		System.out.println(rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();	// column Count
		System.out.println(columnCount);
	
		for (int i = 1; i <= rowCount; i++) {	// for Row
			XSSFRow row = sheet.getRow(i); 		// enter specific row 
			for (int j = 0; j < columnCount; j++) {//for Column
				// enter specific column
				XSSFCell cell = row.getCell(j);
				String value = "";
		
				CellType cellType = cell.getCellType();
				
				if(cellType != CellType.STRING) {
					cell.setCellType(CellType.STRING);
				}
				value = cell.getStringCellValue();
				
			} 

		}


	}

}


/*
 * if(cellType == CellType.STRING) { value = cell.getStringCellValue(); } else
 * if(cellType == CellType.NUMERIC) {
 * if(DateUtil.isCellInternalDateFormatted(cell)) { value =
 * ""+cell.getDateCellValue(); }else { value =
 * ""+(int)cell.getNumericCellValue(); }
 * 
 * } else if(cellType == CellType.FORMULA) { value = cell.getCellFormula(); }
 * 
 * System.out.println(value);
 */
