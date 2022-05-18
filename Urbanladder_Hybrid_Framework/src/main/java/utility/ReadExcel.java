package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static FileInputStream fis;
	
	public static void getRowCount() throws IOException {
		fis=new FileInputStream("./Excel/Urbanladder_valid.xls");
		wb= new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		//int rowCount=sheet.getPhysicalNumberOfRows();
		//System.out.println(rowCount);
	}
	public static String getValidStringData(String filename,int rowNum,int colNum) throws IOException {
		fis=new FileInputStream(filename);
		wb= new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
	}
	
	public static double getCellDataNumeric(int rowNum,int colNum) throws IOException {
		fis=new FileInputStream("./Excel/Urbanladder_Valid.xls");
		wb= new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return cellData;
	}
}
