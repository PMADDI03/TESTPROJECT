package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CallingParticularLine {
	
	//private static int val;
	
	public void readmethod(int linenumber) throws IOException
	{
		File F=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\My1.txt");
		FileReader fr=new FileReader(F);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int num=1;
		while((s=br.readLine())!=null)
		{
			//num=num+1;
			if(num == linenumber)
			{
				System.out.println("Line Number "+num+" Value :: "+s);
				break;
			}		
		
			num++;
		}
		
		br.close();
	}

	public static void main(String[] args) throws IOException {
		CallingParticularLine CP = new CallingParticularLine();
		CP.readmethod(5);

}
	
}




//try {
//System.out.println(val);
//int num =1;
//readmethod(0);
//readmethod(num);
//readmethod(2);
//readmethod(3);
//} catch (IOException e) {
//e.printStackTrace();
//}
//}
	
