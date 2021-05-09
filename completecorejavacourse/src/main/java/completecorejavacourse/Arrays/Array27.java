package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==05)
			{
				i--;
			}
		}
		System.out.println("elements in the array is" );
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
