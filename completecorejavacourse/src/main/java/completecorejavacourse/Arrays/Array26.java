package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==05)
			{
				index=i;
				break;
			}
		}
		System.out.println("elements in the array is" );
		for(int i=0;i<index;i++)
		{
			System.out.println(a[i]);
		}
	}

}
