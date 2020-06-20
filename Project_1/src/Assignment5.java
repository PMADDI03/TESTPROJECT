import java.util.Scanner;

public class Assignment5 {
	//(((((a1+a2)-a3)*a4)+a5)/a6)
	
	public int sum(int a1,int a2)
	{
		int c = a1+a2;		
		System.out.println("Sum of the Total:" +c);
		return c;
	}
	public int sub(int c,int a3)
	{
		int e=c-a3;
		System.out.println("Subtraction Result:" +e);
		return e;
	}
	public int mul(int e,int a4)
	{
		int g=e*a4;
		System.out.println("Multiplication Result:" +g);
		return g;
	}
	public void div(int g,int a6)
	{
		int i=g/a6;
		System.out.println("Final Result:" +i);
		
	}
	public static void main(String[] args) 
	{
		Assignment5 Test = new Assignment5();
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter value of a1 and a2");
		int a1=s.nextInt();
		int a2=s.nextInt();
		int sum_result=Test.sum(a1, a2);
		
		System.out.println("Please enter value of a3");
		int a3=s.nextInt();
		int sub_result=Test.sub(sum_result,a3);
		
		System.out.println("Please enter value of a4");
		int a4=s.nextInt();
		int mul_result=Test.mul(sub_result,a4);
		
		System.out.println("Please enter value of a5");
		int a5=s.nextInt();
		int Sum1_result=Test.sum(mul_result,a5);
		
		System.out.println("Please enter value a6");
		int a6=s.nextInt();
		Test.div(Sum1_result,a6);	
		
	}

}
