
public class ReverseString {

	public static void main(String[] args) {
		String orginal ="Welcome to India";
		String reverse1= new StringBuffer(orginal).reverse().toString();
		
		System.out.println("before reverse:" +orginal);
		System.out.println("after reverse:" +reverse1);

	}

}
