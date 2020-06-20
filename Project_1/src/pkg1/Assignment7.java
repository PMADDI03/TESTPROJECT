package pkg1;

public class Assignment7 {
	
	public void method1()
	{
		this.method2(1);
		System.out.println("Parent default method");
	}
	
	public void method2(int a)
	{
		System.out.println("Parent 1 parametrized method");
	}
	
	public void method3(int a, int b)
	{
		this.method4(1,2,3);
		System.out.println("Parent 2 parametrized method");
	}
	
	public void method4(int a,int b,int c)
	{
		this.method1();
		System.out.println("Parent 3 parametrized method");
	}

	public static void main(String[] args) {
		//Assignment7 obj1 = new Assignment7();
		//obj1.method3(1,2);

	}

}
