package completecorejavacourse.Strings;
import java.util.Scanner;
public class NoOfConsonantsInString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
				count++;
			}
		}
		System.out.println("No of consonants in a string is " +count);
	}
}