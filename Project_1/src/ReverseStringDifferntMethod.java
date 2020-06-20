
public class ReverseStringDifferntMethod {

	public static void main(String[] args) {
		String orginal="YourName";
		String reverse = "";
		int length=orginal.length();
		System.out.println(length);
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+orginal.charAt(i);
			
		}
		System.out.println("Reverse of the string: " + reverse);
	}

}
