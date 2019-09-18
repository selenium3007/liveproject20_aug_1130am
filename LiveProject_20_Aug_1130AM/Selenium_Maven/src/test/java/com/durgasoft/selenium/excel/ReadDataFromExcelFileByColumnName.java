package com.durgasoft.selenium.excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFileByColumnName {
	public FileInputStream fi;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;

	@Test
	public void f() throws Exception {
		fi = new FileInputStream("D:\\LiveProject_20_Aug_1130AM\\Selenium_Maven\\testdata\\login.xlsx");
		w = new XSSFWorkbook(fi);
		s = w.getSheet("Sheet1");
		r = s.getRow(0);
		c = null;
		int column = -1;
		for (int i = 0; i < r.getLastCellNum(); i++) {
			System.out.println(r.getCell(i).getStringCellValue());
			if (r.getCell(i).getStringCellValue().equalsIgnoreCase("Password")) {
				column = i;
				System.out.println(column);
			}
		}
		r=s.getRow(2);
		c=r.getCell(column);
		System.out.println("Value in excel is:"+c.getStringCellValue());

	}
}
