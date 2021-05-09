package completecorejavacourse.Strings;
import java.util.Scanner;
public class SpecialString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<s.length()-1;i++)
		{
				flag=false;
				char ch=s.charAt(i);
				char ch1=s.charAt(i+1);
				if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u' )&& (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1== 'u'))
				{
						flag=true;
						break;
				}
		}
		if(flag==true)
		{
			System.out.println("special string");
		}
		else
		{
			System.out.println("not a special string");
		}
	}
}