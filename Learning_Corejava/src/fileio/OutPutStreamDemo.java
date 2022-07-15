package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo 
{
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		try 
		{
			fos = new FileOutputStream("D:\\File\\test.txt");
			System.out.println("file created...");
			String str = "This is my first io program!!!";
			byte b[] = str.getBytes();
			fos.write(b);
			System.out.println("content written...");
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
