package ExcelHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.LabelCell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TakeInputFromTheUser {
	
	public void method(int i,int j) throws IOException, RowsExceededException, WriteException
	{
		System.out.println("Enter row and column value ");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();		
		File f=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\Test4.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Praveen", 1);
		i=ws.getRows();
		j=ws.getColumns();
		Cell c1=ws.getCell(j, i);
		System.out.println(c1.getContents());
		Label l =new Label(col, row, "test");
		ws.addCell(l);		
		wk.write();
		wk.close();
	}

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		TakeInputFromTheUser inp=new TakeInputFromTheUser();
		inp.method(3, 3);
		
		

	}

}
