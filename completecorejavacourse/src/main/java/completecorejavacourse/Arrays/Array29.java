package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==num)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("super array");
		}
		else
		{
			System.out.println("Psychoo array");
		}
	}

}
