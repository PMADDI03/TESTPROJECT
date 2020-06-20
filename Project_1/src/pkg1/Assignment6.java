package pkg1;

public class Assignment6 {
	
	public Assignment6()
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	
	public Assignment6(int a)
	{
		this();
		System.out.println("Parent 1 parametrized Constructor");
	}
	
	public Assignment6(int a,int b)
	{
		this(1);
		System.out.println("Parent 2 parametrized Constructor");
	}
	
	public Assignment6(int a,int b,int c)
	{
		System.out.println("Parent 3 parametrized Constructor");
		
	}

	public static void main(String[] args) {
		//Assignment6 assignment6 = new Assignment6(1,2);
	}

}
