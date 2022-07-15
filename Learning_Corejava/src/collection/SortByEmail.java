package collection;

import java.util.Comparator;

public class SortByEmail implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		String name1 = o1.email;
		String name2 = o2.email;
		
		return name1.compareTo(name2);
	}

}
