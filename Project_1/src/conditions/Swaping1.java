package conditions;

import java.util.Scanner;

public class Swaping1 {

	public static void main(String[] args) {
		
		System.out.println("Before Swapping");				
		//int x;
		//int y;
		System.out.println("Please enter value x and y ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("value of x:" +x );
		System.out.println("value of y:" +y );
		
		System.out.println("After Swapping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x:" +x );
		System.out.println("value of y:" +y );		
		

	}

}
