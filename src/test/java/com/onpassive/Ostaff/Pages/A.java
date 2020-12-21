package com.onpassive.Ostaff.Pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {

	public void writeDataToExcel(String path, String sheet, int row, int cell, String givenInput) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println("Work book initiation");
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(givenInput);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		System.out.println("writing done..");

	}

	public static int getRowCount(String path, String sheet) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
}
