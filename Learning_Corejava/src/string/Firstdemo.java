package string;

public class Firstdemo
{
	public static void main(String[] args) {
		
		//String s = "Tops";
		//String str = new String("tops");
		
		//String s1 = s.concat("tech");
		//System.out.println(s1);
		
		
		String s1 = new String("java");
		String s2 = new String("php");
		String s3 = new String("java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		
		System.out.println("*********************");
		
		String str1 = "java";
		String str2 = "php";
		String str3 = "java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		
		
		
	}
}
