package com.dhl.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemo2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("test_data/OrangeData.xlsx");

		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[rowcount-1][colCount];
		DataFormatter format=new DataFormatter();
		
		for(int i=1;i<rowcount;i++) {
			for (int j=0;j<colCount;j++) {
							
			data[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
				
			}
		}
		
		System.out.println(data[0][0]);
	}

}
