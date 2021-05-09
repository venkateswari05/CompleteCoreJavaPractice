package completecorejavacourse.Strings;
import java.util.Scanner;
public class Palindrome1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(s.length()-i-1);
			s1=s1+Character.toString(ch);
		}
		if(s1.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
