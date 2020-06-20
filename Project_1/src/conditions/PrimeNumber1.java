package conditions;


public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int j,i;
		int flag = 0;			
		for(i=5;i<=50;i++)
		{
		for(j=2;j<i;j++)
		{
		if(i%j==0) 
		{			
		flag=flag+1;		
		}
		
		}
		
		if (flag==0)
		{
			System.out.println("Print the Prime Number between 5 to 50:" +i);
		}
		else
		{
			flag=0;
		}
		}
	}
}

		
			

	

	


