package completecorejavacourse.Strings;
import java.util.Scanner;
public class NoOfPalindromesInString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		String s1="";
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			s1="";
			for(int j=0;j<s[i].length();j++)
			{
				char ch=s[i].charAt(s[i].length()-j-1);
				s1=s1+Character.toString(ch);
			}
			if(s1.equals(s[i]))
			{
				count++;
			}
		}
		System.out.println(count +" palindromes are there in array");
	}
}
