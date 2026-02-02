package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel011 {
	@SuppressWarnings("resource")
	public String ReadCellData(int vRow, int vColumn) throws IOException{
		String value = null;
		Workbook wb = null;
		
		
	FileInputStream fis=new FileInputStream("./testdata/payalexcelsheet.x1sx");
	wb=new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheetAt(0);
	Row row= sheet.getRow(vRow);
	Cell cell=row.getCell(vColumn);
	value= cell.getStringCellValue();
	return value;
	
	
	}
	
}