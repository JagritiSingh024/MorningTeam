package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	@Test
	private void tc1() throws IOException {
		
		File loc = new File("C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\data\\testdata.xls");
		FileInputStream input  = new FileInputStream(loc);
		Workbook w = new HSSFWorkbook(input);
		Sheet s= w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		
		
	}

}
