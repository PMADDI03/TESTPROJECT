package pkg1;

public class Assignment6Part2 extends Assignment6
{
//2 parameter from parent
	public Assignment6Part2()
	{
		this(1,2);
		System.out.println("Child default constructor");
	}
	
	public Assignment6Part2(int a)
	{
		this(1,2,3);
		System.out.println("Child one parametrized constructor");
	}
	
	public Assignment6Part2(int a,int b)
	{
		super(1,2);
		System.out.println("Child two parametrized constructor");
	}
	
	public Assignment6Part2(int a,int b,int c)
	{
		this();
		System.out.println("Child three parametrized constructor");
	}
	
	public static void main(String[] args) {
		
		Assignment6Part2 obj = new Assignment6Part2(1);

	}

}
