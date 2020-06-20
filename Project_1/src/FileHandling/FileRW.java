package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	public static void main(String[] args) throws IOException {
		File F=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\My1.txt");
		FileReader fr=new FileReader(F);
		BufferedReader br=new BufferedReader(fr);
		File F1=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\My2.txt");
		FileWriter fw=new FileWriter(F1);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();			
			System.out.println(s);
		}
		//br.close();
		bw.close();		
			
	}

}
