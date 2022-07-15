package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentCollection 
{
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(10, "tops", "tops@gmail.com"));
		st.add(new Student(5,"abc","abc@gmail.com"));
		st.add(new Student(3, "xyz", "xyz@gmail.com"));
		st.add(new Student(9, "parth", "parth@gmail.com"));
		
		//Collections.sort(st);
		
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Student s = itr.next();
			s.display();
		}
		
		
		
		
	}
}
