package com.onpassive.Ostaff.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	
	public String getPropKeyvalue(String propPath,String key) throws Exception {

		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key,"Not a valid Key");
		return propvalue;
	}
	
	public static int getRowCount(String path,String sheet) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount =wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
	public String getCellData(String path,String sheet,int row,int cell) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println("Excel Data" +wb);
		String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
		return excelValue;
	}
	
	public void writeDataToExcel(String path,String sheet,int row,int cell,String givenInput) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory .create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(givenInput);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		System.out.println("writing done..");
		
	}
}