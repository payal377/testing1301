package excelpoireadpack;

import java.io.IOException;

import org.testng.annotations.Test;

import Excel.Excel011;

public class excelpoi_access {
	Excel011 obj = new Excel011();
  @Test
  public void ReadDataFromExcel() throws IOException {
		
		Excel011 obj = new Excel011();
		
		String res=obj.ReadCellData(1,2);
		System.out.println(res);
  }
}
