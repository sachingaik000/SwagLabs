package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(name="loginData")
	public String[][] getData() throws Exception {

		File f=new File("C://Sachin//TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfCol=sheet.getRow(0).getLastCellNum();
		
		String data[][]=new String[noOfRows-1][noOfCol];
		for(int i=0;i<noOfRows-1;i++)
		{
			for(int j=0;j<noOfCol;j++)
			{
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				DataFormatter df=new DataFormatter();
				//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		wb.close();
		fis.close();
		/*for(String[] dataarr:data)
		{
			System.out.println(Arrays.toString(dataarr));
		}*/
		return data;

	}

}
