package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CallingParticularCell {
	
	public void readmethod(int i,int j) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\Test1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();//3 rows
		int c=ws.getColumns();//5 columns
		if(i<r && j<c)
		{
			Cell c1=ws.getCell(j,i);
			System.out.println(c1.getContents());
		}
		else
		{
			System.out.println("mentioned cell value data is not exist");
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		
		CallingParticularCell CPC=new CallingParticularCell();
		CPC.readmethod(1, 4);

	}

}
