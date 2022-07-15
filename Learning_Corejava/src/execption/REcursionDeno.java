package execption;

class Demo
{
	public void square(int a)
	{
		int sq = a*a;
		System.out.println("Square of "+a +" is : "+sq);
		a++;
		if(a<10) {
			square(a);
		}
		
	}
}
public class REcursionDeno 
{
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.square(2);
		
		
		
	}
}
