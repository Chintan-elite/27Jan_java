package fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo
{
	public static void main(String[] args) {
		
		File file = new File("D:\\File\\test.txt");
		
		//Folder
//		if(file.exists())
//		{
//			System.out.println("Available");
//		}
//		file.mkdir();
		
		//file
		/*
		 * if(file.exists()) { System.out.println("file availableat this location");
		 * file.delete(); System.out.println("file deleted..."); } else {
		 * System.out.println("File not available"); try { file.createNewFile();
		 * System.out.println("file created..."); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } }
		 */
		
		//System.out.println(file.isDirectory());
		//System.out.println(file.isFile());
		
	}
}
