package statements;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		
		int choice=0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		int n2 = sc.nextInt();
		System.out.println("Enter Choice : ");
		System.out.println("1 : Add");
		System.out.println("2 : Sub");
		System.out.println("3 : Mul");
		System.out.println("4 : Div");
		System.out.println("0 : Exit");
		choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1 : 
			System.out.println("Addition is : "+(n1+n2));
			break;
		case 2 :
			System.out.println("Substraction is : "+(n1-n2));
			break;
		case 3 : 
			System.out.println("Multiplication is : "+(n1*n2));
			break;
		case 4 :
			System.out.println("Division is : "+(n1/n2));
			break;
		default :
			System.out.println("Invalid Input , Try again !!!");
		
		}
		
		}while(choice!=0);
		
		
		
		
		
		
		
		
	}
}
