package oops;

abstract class Shape
{
	public abstract void getarea();
}

class Circle extends Shape
{
	final double PI=3.14;
	double r;
	
	public Circle(double r) {
				this.r = r;
	}

	@Override
	public void getarea() 
	{
		double area = PI*r*r;
		System.out.println("Area of circel is : "+area);
	}
	
}

class Triangle extends Shape
{
	double base;
	double height;
	public Triangle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}
	@Override
	public void getarea() {
		
		double area = 0.5 * base*height;
		System.out.println("Area of triangle is : "+area);
		
	}
	
}

public class OOPS012_AreaFinder
{
	public static void main(String[] args) {
		
		Shape s1 = new Circle(20);
		Shape s2 = new Triangle(20, 30);
		
		s1.getarea();
		s2.getarea();
		
		
	}
}
