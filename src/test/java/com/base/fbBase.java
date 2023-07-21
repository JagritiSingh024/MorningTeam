package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbBase {

	public static WebDriver driver;
	public static void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	public static String stringData(int row,int cell) throws IOException {
		File loc = new File("C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\data\\testdata.xls");
		FileInputStream input  = new FileInputStream(loc);
		Workbook w = new HSSFWorkbook(input);
		Sheet s= w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
		
	}
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickBtn(WebElement element) {
		element.click();
	}
}

