package completecorejavacourse.Strings;
import java.util.Scanner;
public class String14 {

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
			if(!arr[i].equals("-1"))
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i].equals(arr[j]))
					{
						arr[j]="-1";
					}
				}
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(!arr1[i].equals("-1"))
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr1[i].equals(arr1[j]))
					{
						arr1[j]="-1";
					}
					if(arr1[i].equals(arr[j-1]))
					{
						flag=true;
						break;
					}
				}
				if(flag==false)
				System.out.println(arr1[i]);
			}
		}
	}
}