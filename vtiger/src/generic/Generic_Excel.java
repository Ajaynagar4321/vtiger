package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
	
	public static String fetchExceldata(String sheetpath,String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream(sheetpath));
	String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
	return data;
	}
	
	public static void writeExcelSheet(String sheetpath,String sheetname,int rownum,int cellnum,String value) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(sheetpath));
		wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(value);
	}

	public static int lastrow(String sheetpath,String sheetname) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(sheetpath));
		int data = wb.getSheet(sheetname).getLastRowNum();
		return data;
		
	}
	
	public static int lastcol(String sheetname, String sheetpath) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream(sheetpath));
    int data = wb.getSheet(sheetname).getRow(0).getLastCellNum();
    return data;
	
	}
	

}
