package array;

import java.util.Iterator;
import java.util.Scanner;

public class MultiDai_Temp {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a[][] = new int[2][7];
			int temp;
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<7;j++)
				{
					System.out.println("Enter value for city : "+(i+1)+" day : "+(j+1));
					a[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<7;j++)
				{
					System.out.println("Temp of city : "+(i+1)+" day : "+(j+1)+" is : "+(a[i][j]));
					
				}
			}
			
			
			
			
			
		}
}
