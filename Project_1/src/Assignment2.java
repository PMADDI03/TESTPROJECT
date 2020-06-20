
public class Assignment2 {
	//((((10+2)-2)*2)+2)/2)
	
	public int sum(int a,int b)
	{
		int c =a+b;		
		//System.out.println("Sum of the Total");
		return c;
	}
	public int sub(int c,int d)
	{
		int e=c-d;
		return e;
	}
	public int mul(int e,int f)
	{
		int g=e*f;
		return g;
	}
	public void div(int g,int h)
	{
		int i=g/h;
		System.out.println("Final Result:" +i);
		
	}
	public static void main(String[] args) {
		Assignment2 Praveen =new Assignment2();
		int sum_result = Praveen.sum(10, 2);
		System.out.println("First Result:" + sum_result);
		int sub_result = Praveen.sub(12, 2);
		System.out.println("Second Result:" + sub_result);
		int mul_result = Praveen.mul(10, 2);
		System.out.println("Third Result:" + mul_result);
		int sum_result2 = Praveen.sum(20, 2);
		System.out.println("Fourth Result:" + sum_result2);
		Praveen.div(22, 2);			
			
		
		}

}
