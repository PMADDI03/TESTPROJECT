
public class Student {
	
	int a;
	int b;
	
	public void NumberOfSections()
	{
		System.out.println("Five Sections");
	}
	
	public void NumberOfStudetns()
	{
		System.out.println("Two fifty students");
	}
	

	public static void main(String[] args) {
		Student Praveen = new Student();
		Praveen.a = 5;
		Praveen.b = 250;
		System.out.println(Praveen.a);
		System.out.println(Praveen.b);
		Praveen.NumberOfSections();
		Praveen.NumberOfStudetns();
		
	}

}
