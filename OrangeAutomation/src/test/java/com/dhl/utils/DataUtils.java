package com.dhl.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {

	
	@DataProvider
	public String[][] invalidLoginData() {
	String[][] data=new String[2][3];
	data[0][0]="saul";
	data[0][1]="saul123";
	data[0][2]="Invalid credentials";
		
	data[1][0]="john";
	data[1][1]="john123";
	data[1][2]="Invalid credentials";
	return data;
	
	}
	
	@DataProvider
	public String[][] commonDataProvider(Method mtd) throws IOException{
		
		String testCaseName= mtd.getName();
		String[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/OrangeData.xlsx", testCaseName);
		return data;
		
	}
}
