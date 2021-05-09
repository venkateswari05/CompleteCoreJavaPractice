package completecorejavacourse.Arrays;
import java.util.Scanner;
public class SecondMaxInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int num1=a[0],num2=a[0];
		for(i=0;i<a.length;i++)
		{
			if(num1<a[i])
			{
				num1=a[i];
			}	
		}
		for(i=0;i<a.length;i++)
		{
			if(num2<a[i] && a[i]!=num1)
			{
				num2=a[i];
			}	
		}
		System.out.println("maximum value is " +num2);
}
}
