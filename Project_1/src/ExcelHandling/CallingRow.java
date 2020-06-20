package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CallingRow {
	
	public void rownum(int rownum) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\Test1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		if(rownum<r)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(j, rownum);
				System.out.println(c1.getContents());
			}
			
		}		
	}

	public static void main(String[] args) throws BiffException, IOException {
		CallingRow CR=new CallingRow();
		CR.rownum(1);

	}

}
