package conditions;

import java.util.Scanner;

public class Swapwithusing3variable {

	public static void main(String[] args) {
		System.out.println("Before Swapping");
		int a,b,temp;
		System.out.println("Please enter value of a and b");
		Scanner Test = new Scanner(System.in);
		a = Test.nextInt();
		b = Test.nextInt();
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
		
		System.out.println("After Swapping");
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);		
		
		// TODO Auto-generated method stub

	}

}
