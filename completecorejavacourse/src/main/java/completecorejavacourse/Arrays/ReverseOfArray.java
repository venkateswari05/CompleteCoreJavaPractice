package completecorejavacourse.Arrays;
import java.util.Scanner;
public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			b[size-1-i]=a[i];
		}
		System.out.println("Reverse of an array is ");
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
}
}
