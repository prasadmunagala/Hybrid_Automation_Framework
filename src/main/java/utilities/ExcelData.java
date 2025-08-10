package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	

		
	public ArrayList<ArrayList<Object>> exceldata()
	{
	String wb_path="/Users/balaseshagiriprasadmunagala/Desktop/Credentials.xlsx";
	FileInputStream  fis;
	Workbook  workbook;

	//ArrayList = [ [Admin,admin123], [admin,admin13] ]
	ArrayList<ArrayList<Object>> excel_data=new ArrayList<ArrayList<Object>>();
	
	try
	{
		fis=new FileInputStream(wb_path);
		workbook=new XSSFWorkbook(fis);
		int sheets_count=workbook.getNumberOfSheets();
		
		
		int rowCount=0;
		
		for(int i=0;i<sheets_count;i++)
		{
			Sheet sheet=workbook.getSheetAt(i);
			
			// [Admin,admin123]
			ArrayList<Object> temp_data;
			
			for(Row row:sheet)
			{
				
				if(rowCount!=0) 
				{

					temp_data=new ArrayList<>();
					for(Cell cell:row)
					{
						
							
							switch(cell.getCellType())
							{
								case NUMERIC:
									int idata=(int)cell.getNumericCellValue();
									temp_data.add(idata);
									break;
									
								case STRING:
									String sdata=cell.getStringCellValue();
									temp_data.add(sdata);
									break;
									
								case BOOLEAN:
									boolean bdata=cell.getBooleanCellValue();
									temp_data.add(bdata);
									break;
							}
					}
					excel_data.add(temp_data);
				
				}
				else
				{
					rowCount++;
				}
				
				
			}
		
			fis.close();
			workbook.close();
		}
		
	}
	
	catch(Exception e)
	{
		System.out.println("file not found");
	}
	
	
	return excel_data;
	

	}

}
