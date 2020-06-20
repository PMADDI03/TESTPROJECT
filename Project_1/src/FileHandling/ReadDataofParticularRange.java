	package FileHandling;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class ReadDataofParticularRange {
	
		public void readmethod(int intialnumber,int endnumber) throws IOException
		{
			File F=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\My1.txt");
			FileReader fr=new FileReader(F);
			BufferedReader br=new BufferedReader(fr);
			String s;
			int num=3;
			while((s=br.readLine())!=null)
			{
				
				if(num>=intialnumber && num<=endnumber)
				{
					System.out.println("Line Number "+num+" Value :: "+s);
				}
								
				num++;
			}
			
			br.close();
		}

		public static void main(String[] args) throws IOException {
			ReadDataofParticularRange RDP = new ReadDataofParticularRange();
			RDP.readmethod(2, 6);

	}
		
	}

	