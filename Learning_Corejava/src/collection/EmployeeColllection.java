package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeColllection 
{
	public static void main(String[] args) {
		
		ArrayList<Employee> st = new ArrayList<Employee>();
		st.add(new Employee(10, "tops", "abc@gmail.com"));
		st.add(new Employee(5,"abc","xyz@gmail.com"));
		st.add(new Employee(3, "xyz", "tops@gmail.com"));
		st.add(new Employee(9, "parth", "kparth@gmail.com"));
		
		
		//Collections.sort(st,new SortById());
		//Collections.sort(st,new SortByName());
		Collections.sort(st,new SortByEmail());
		
		Iterator<Employee> itr = st.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Employee s = itr.next();
			s.display();
		}
		
		
		
		
	}
}
