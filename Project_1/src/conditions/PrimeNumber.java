package conditions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int x = s.nextInt();

		for (i=2;i<x;i++) {
			if (x%i==0) {
				flag=flag + 1;
			}
		}

		if (flag>0) 
		{
		System.out.println("Entered number is not a Prime Number:" + x);
		} 
		else 
		{
		System.out.println("Entered number is Prime Number:" + x);
		}

	}

}
