package com.durgasoft.selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelDataByIndex {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;

	@Test
	public void f() throws Exception {
		fi = new FileInputStream("D:\\LiveProject_20_Aug_1130AM\\Selenium_Maven\\testdata\\login.xlsx");
		w = new XSSFWorkbook(fi);
		s = w.getSheet("Sheet1");
		r = null;
		c = null;
		r=s.getRow(4);
		if (r == null)
			r = s.createRow(4);
		c=r.getCell(2);
		if (c == null)
			c = r.createCell(2);
		c.setCellValue("FAIL");
		fo = new FileOutputStream("D:\\LiveProject_20_Aug_1130AM\\Selenium_Maven\\testdata\\login.xlsx");
		w.write(fo);
		fo.close();
	}
}
