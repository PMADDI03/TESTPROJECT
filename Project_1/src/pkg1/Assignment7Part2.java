package pkg1;

public class Assignment7Part2 extends Assignment7 {
	
	public void test1()
	{
		this.test3(1,2);
		System.out.println("Child default method");
	}
	
	public void test2(int a)
	{
		this.test4(1,2,3);
		System.out.println("Child one parametrized method");
	}
	
	public void test3(int a,int b)
	{
		super.method3(1,2);
		System.out.println("Child two parametrized method");
	}
	
	public void test4(int a,int b,int c)
	{
		this.test1();
		System.out.println("Child three parametrized method");
	}
	
	public static void main(String[] args) {
		Assignment7Part2 obj2 = new Assignment7Part2();
		obj2.test2(1);
		
		

	}

}
