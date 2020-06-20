
public class Assignment4_this {

	public Assignment4_this() 
	{
		this(10,20,30);
		System.out.println("Default parameterized Constructor");
	}

	public Assignment4_this(int a) 
	{
		this();
		System.out.println("One Parameterized Constructor");
	}

	public Assignment4_this(int a, int b) 
	{
		this(10);
		System.out.println("two Parameterized Constructor");
	}

	public Assignment4_this(int a, int b, int c) 
	{
		System.out.println("three parameterized constructor");
	}

	public static void main(String[] args) 
	{
		Assignment4_this Con = new Assignment4_this(1,2);

	}

}
