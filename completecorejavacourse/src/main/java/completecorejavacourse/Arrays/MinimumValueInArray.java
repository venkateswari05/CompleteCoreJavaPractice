package completecorejavacourse.Arrays;
import java.util.Scanner;
public class MinimumValueInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int num=a[0];
		for(i=0;i<a.length;i++)
		{
			if(num>a[i])
			{
				num=a[i];
			}	
		}
		System.out.println("minimum value is " +num);
}
}
