package completecorejavacourse.Strings;
import java.util.Scanner;
public class StringExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String arr[]=new String[n];
		String arr1[]=new String[m];
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++)
		{
			flag=false;;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i].equals(arr1[j]))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			flag=false;;
			for(int j=0;j<arr.length;j++)
			{
				if(arr1[i].equals(arr[j]))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(arr1[i]);
			}
		}
	}
}