
public class Assignment3 {

	////((((10/2)-2)+2)-2)*2)
	public int div(int a,int b) {
		int c=a/b;
		System.out.println("Division Result:" +c);
		return c;		
	}
	
	public int sub(int c,int d) {
		int e=c-d;
		System.out.println("Subtraction Result:" +e);
		return e;
		
	}
	public int sum(int e,int f) {
		int g =e+f;
		System.out.println("Sum Result:" +g);
		return g;
	}
	public void mul(int g,int h) {
		int i =g*h;
		System.out.println("Multiplication Result:" +i);
		
	}
	
	public static void main(String[] args) {
		Assignment3 P = new Assignment3();	
		P.div(10, 2);
		P.sub(5, 2);
		P.sum(3, 2);
		P.sub(5, 2);
		P.mul(3, 2);	
		
				
	}

}
