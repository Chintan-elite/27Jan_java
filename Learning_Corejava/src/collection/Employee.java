package collection;

public class Employee 
{
	int id;
	String name;
	String email;
	
	public Employee(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
}
