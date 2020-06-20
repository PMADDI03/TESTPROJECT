package conditions;

import java.util.Scanner;

public class PtintaTable {

	public static void main(String[] args) {
		System.out.println("Enter Number");		
		Scanner S = new Scanner(System.in);
		int a =S.nextInt();
		int i;
		System.out.println("Please enter a number to print table");
		for (i=1;i<=10;i++)
		{
			int x=a*i;
			System.out.println(a + "*" + i + " = " + (x));
		}
		

	}

}
