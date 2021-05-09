package completecorejavacourse.Strings;
import java.util.Scanner;
public class ContainsUsageInString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="abcdefghijklmnopqrstuvwxyz";
		if(s.contains(s1))
		{
			System.out.println("string contains all d elements");
		}
		else
		{
			System.out.println("string doesnot contain all d elements");
		}
	}
}