package HelperClasses;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import utilities.ExcelData;

public class ExcelHelper {
	
	public static void main(String s[])
	{
		ExcelData exdata=new ExcelData();
		ArrayList<ArrayList<Object>> xdata=exdata.exceldata();
		
		Object[][] data=new Object[xdata.size()][1];
		for(int i=0;i<xdata.size();i++)
		{
			data[i][0]=xdata.get(i);
		}
		
		System.out.println(data[0][0].toString());
	}
	
//	@DataProvider
//	public Object[][] xl_data()
//	{
//		ExcelData exdata=new ExcelData();
//		ArrayList<ArrayList<Object>> xdata=exdata.exceldata();
//		
//		Object[][] data=new Object[xdata.size()][1];
//		for(int i=1;i<xdata.size();i++)
//		{
//			data[i][0]=xdata.get(i);
//		}
		
//		return data;
//	}

}
