package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	//Open any XL file passing parameters 
	public static String getCellData(String path, String sheet, int r,int c)
	{
		String v="";
		try
		{
			v= WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
		}
		return v;
	}
	// Get number of rows present in the XL file in a particular sheet
	public static int getRowCount(String path, String sheet)
	{
		int rc=0;
		try
		{
			rc= WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
		}
		return rc;
	}
}
