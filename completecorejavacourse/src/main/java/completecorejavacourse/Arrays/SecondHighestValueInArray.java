package completecorejavacourse.Arrays;
import java.util.Scanner;
public class SecondHighestValueInArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Second highest element in an array is " +a[1]);
}
}
