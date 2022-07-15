package collection;

import java.util.Comparator;

public class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		int id1 = o2.id;
		int id2 = o1.id; 
		int i = 0;
		if(id1>id2)
		{
			i=-1;
		}
		else if(id1<id2)
		{
			i=+1;
		}
		else if(id1==id2)
		{
			i=0;
		}
		return i;
	
	}

}
