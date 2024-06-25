package objectrepository;

public class exelfileutility extends organizationpage {
	package genericUtlities;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelFileUtility {
	public String readDatafromExcl(String Sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fise=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\staragile\\Manual Testing\\Wellsforgocompany\\EveningAdvancedselenium\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fise);
		String value = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	}
	}
}
