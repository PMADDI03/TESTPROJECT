package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelRWwithJXL {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
	File f=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\Test1.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	
	File f1=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\Test2.xls");
	WritableWorkbook wwk=Workbook.createWorkbook(f1);
	WritableSheet wws=wwk.createSheet("Praveen", 1);
	
	int r=ws.getRows();
	int c=ws.getColumns();
	System.out.println("No of Rows:" +r);
	System.out.println("No of Columns:" +c);	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			Cell c1=ws.getCell(j, i);
			String S=c1.getContents();
			System.out.println(S);
			Label l= new Label(j, i,S);
			wws.addCell(l);
			
		}
		
	}
	wwk.write();
	wwk.close();

	}

}
