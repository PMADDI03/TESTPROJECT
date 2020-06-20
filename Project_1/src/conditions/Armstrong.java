package conditions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
				
			System.out.println("Enter Number");		
			Scanner S = new Scanner(System.in);
			int a =S.nextInt();
			int b,temp,sum=0;		
			temp = a;
			while(a>0) 
			{
			b=a%10;
			sum=sum+b*b*b;
			a=a/10;	
			}
			if(temp==sum)
			{
				System.out.println("Entered Number is Armstrong");
			}
			else 
			{
			System.out.println("Entered Number is not a Armstrong");
				
			}
				
				
			

		}

	}


