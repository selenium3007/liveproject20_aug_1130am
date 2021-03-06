package com.durgasoft.selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_API {
	public FileInputStream fi = null;
	public FileOutputStream fo = null;
	public XSSFWorkbook w = null;
	public XSSFSheet s = null;
	public XSSFRow r = null;
	public XSSFCell c = null;
	String filepath;

	public Excel_API(String file) throws Exception {
		this.filepath = file;
		fi = new FileInputStream(filepath);
		w = new XSSFWorkbook(fi);
		fi.close();
	}

	// Reading data from excel file by using column index
	public String getCellData(String sheetName, int colNum, int rowNum) {
		try {
			s = w.getSheet(sheetName);
			r = s.getRow(rowNum);
			c = r.getCell(colNum);

			if (c.getCellTypeEnum() == CellType.STRING) {
				return c.getStringCellValue();
			} else if (c.getCellTypeEnum() == CellType.NUMERIC || c.getCellTypeEnum() == CellType.FORMULA) {
				return String.valueOf(c.getNumericCellValue());
			} else if (c.getCellTypeEnum() == CellType.BLANK) {
				return " ";
			} else {
				return String.valueOf(c.getBooleanCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "No matching value";
		}
	}

	// Reading data from excel file by using column name
	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			int colNum = -1;
			s = w.getSheet(sheetName);
			r = s.getRow(0);
			for (int i = 0; i < r.getLastCellNum(); i++) {
				if (r.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
					colNum = i;
				}
			}
			r = s.getRow(rowNum);
			c = r.getCell(colNum);

			if (c.getCellTypeEnum() == CellType.STRING) {
				return c.getStringCellValue();
			} else if (c.getCellTypeEnum() == CellType.NUMERIC || c.getCellTypeEnum() == CellType.FORMULA) {
				return String.valueOf(c.getNumericCellValue());
			} else if (c.getCellTypeEnum() == CellType.BLANK) {
				return " ";
			} else {
				return String.valueOf(c.getBooleanCellValue());
			}
		} catch (Exception e) {

			e.printStackTrace();
			return "No matching value";
		}
	}
	// Identifying no.of rows and columns
	public int getRows(String sheetName) {
		s = w.getSheet(sheetName);
		int rowCount = s.getLastRowNum() + 1;
		return rowCount;
	}

	public int getColumns(String sheetName) {
		s = w.getSheet(sheetName);
		r = s.getRow(0);
		int columnCount = r.getLastCellNum();
		return columnCount;
	}
}
