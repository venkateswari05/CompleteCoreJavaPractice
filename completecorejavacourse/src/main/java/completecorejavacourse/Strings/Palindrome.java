package completecorejavacourse.Strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		StringBuffer sb=new StringBuffer("MADAM");
		StringBuffer s=sb.reverse();
		if(sb.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
