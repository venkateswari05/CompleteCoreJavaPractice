package completecorejavacourse.Strings;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		String key="Hello";
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(key.equals(arr[i]))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("key found");
		}
		else
		{
			System.out.println("key not found");
		}
	}

}
