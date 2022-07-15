package oops;

class Student
{
	public Student()
	{
		System.out.println("constructor Calling...");
	}
	
	
	int id;
	String name;
	static String collage="SVNIT";
	
	public Student(int a, String b)
	{
		id = a;
		name =b;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+collage);
	}
	
}

public class OOPS02_CnstructorDemo 
{
	
	public static void main(String[] args) {
		
		Student st = new Student(10,"Tops");
		st.display();
		
		Student st1 = new Student(20, "Parth");
		st1.display();
		
		Student st3 = new Student();
	}
}
