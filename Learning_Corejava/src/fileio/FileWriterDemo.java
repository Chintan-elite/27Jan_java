package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{
	public static void main(String[] args)
	{
		try {
			FileWriter fw = new FileWriter("D:\\File\\hello.txt");
			String s = "Hello tops hello java";
			fw.write(s);
			fw.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
