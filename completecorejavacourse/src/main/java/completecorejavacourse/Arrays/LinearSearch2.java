package completecorejavacourse.Arrays;
import java.util.Scanner;
public class LinearSearch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int key=sc.nextInt();
		int row=0,column=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==key)
				{
					row=i;
					column=j;
					flag=true;
				} 
			}
		}
		if(flag==true)
		{
			System.out.println("last index of key is " +row +" , " +column);
		}
		else
		{
			System.out.println("key index not found");
		}
	}
}
