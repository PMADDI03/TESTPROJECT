package conditions;

public class FibnocciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,d;
		//System.out.println(a+ " " +b);
		for(d=0;d<10;++d)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
