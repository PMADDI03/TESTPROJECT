package conditions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {		
		System.out.println("Enter Number");		
		Scanner S = new Scanner(System.in);
		int a =S.nextInt();
		int b,temp,sum=0;		
		temp = a;
		while(a>0) 
		{
		b=a%10;
		sum=(sum*10)+b;
		a=a/10;	
		}
		if(temp==sum)
		{
			System.out.println("Entered Number is Palindrome");
		}
		else 
		{
		System.out.println("Entered Number is not a palindrom");
			
		}
			
			
		

	}

}
