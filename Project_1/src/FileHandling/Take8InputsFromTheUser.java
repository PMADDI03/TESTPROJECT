package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Take8InputsFromTheUser {
	
//Create a method and take 8 inputs from the user and write in 
//a file( using loop) and call this method from the main method.	

	public void writedata() throws IOException
	{
		  System.out.println("Enter the input Lines");
		  Scanner s=new Scanner(System.in);
			File F1=new File("C:\\Users\\pmaddi.EVOKE\\Desktop\\My3.txt");
			FileWriter fw=new FileWriter(F1);
			BufferedWriter bw=new BufferedWriter(fw);
		  for(int i=1;i<=8;i++)
		  {
		     String s1=s.next();
		     bw.write(s1); 
		     System.out.println(s1);
		     bw.newLine();
		  }
		  bw.close();
		  
	}
	public static void main(String[] args) throws IOException {
		Take8InputsFromTheUser inp = new Take8InputsFromTheUser();
		inp.writedata();

	}

}
