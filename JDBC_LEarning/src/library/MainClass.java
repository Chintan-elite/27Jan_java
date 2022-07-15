package library;

import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args) {
		
		int choice=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entr your Choice : ");
		System.out.println("0 : Exit");
		System.out.println("1 : Add book");
		System.out.println("2 : View Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Issue Book");
		choice = sc.nextInt();
		LibraryOpration lo = new LibraryOpration();
		switch (choice)
		{
		case 1:
			lo.addBook();
			break;
		case 2:
			lo.viewBook();
			break;
		case 3:
			lo.deleteBook();
			break;
		case 4:
			lo.issueBook();
			break;
		case 0 : 
			System.out.println("******Exit*****");
			break;
		default:
			System.out.println("Please enter Valid Choice");
			break;
		}
		
		}while(choice!=0);
		
		
		
		
	}
}
