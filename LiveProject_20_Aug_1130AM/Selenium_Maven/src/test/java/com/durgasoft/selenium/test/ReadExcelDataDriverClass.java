package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import com.durgasoft.selenium.excel.Excel_API;

public class ReadExcelDataDriverClass {

	@Test
	public void f() throws Exception {
		Excel_API e = new Excel_API("D:\\\\LiveProject_20_Aug_1130AM\\\\Selenium_Maven\\\\testdata\\\\login.xlsx");
		System.out.println("---Reading data from excel file by column index-----");
		System.out.println(e.getCellData("Sheet1", 0, 2));
		System.out.println(e.getCellData("Sheet1", 1, 2));
		System.out.println(e.getCellData("Sheet1", 2, 2));
		System.out.println("---Reading data from excel file by column Name-----");
		System.out.println(e.getCellData("Sheet1", "User Name", 2));
		System.out.println(e.getCellData("Sheet1", "Password", 2));
		System.out.println(e.getCellData("Sheet1", "Results", 2));
	}
}
