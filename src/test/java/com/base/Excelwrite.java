package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class Excelwrite {
	@Test
	private void tc1() throws IOException {
		
		File loc = new File("C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\data\\testdata.xls");

		Workbook w = new HSSFWorkbook();
		Sheet s= w.createSheet("Besant");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("JavaWorld");
		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);
		System.out.println("Test Case Passed");
	}
}
