package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==10)
			{
				a1++;
			}
			else if(a[i]==20)
			{
				a2++;
			}
			else if(a[i]==30)
			{
				a3++;
			}
			else if(a[i]==40)
			{
				a4++;
			}
			else if(a[i]==50)
			{
				a5++;
			}
			else if(a[i]==60)
			{
				a6++;
			}
			else if(a[i]==70)
			{
				a7++;
			}
			else if(a[i]==80)
			{
				a8++;
			}
			else if(a[i]==90)
			{
				a9++;
			}
		}
		if(a1>0)
		{
			System.out.println("10 occurs "+ a1 +" times");
		}
		if(a2>0)
		{
			System.out.println("20 occurs "+ a2 +" times");
		}
		if(a3>0)
		{
			System.out.println("30 occurs "+ a3 +" times");
		}
		if(a4>0)
		{
			System.out.println("40 occurs "+ a4 +" times");
		}
		if(a5>0)
		{
			System.out.println("50 occurs "+ a5 +" times");
		}
		if(a6>0)
		{
			System.out.println("60 occurs "+ a6 +" times");
		}
		if(a7>0)
		{
			System.out.println("70 occurs "+ a7 +" times");
		}
		if(a8>0)
		{
			System.out.println("80 occurs "+ a8 +" times");
		}
		if(a9>0)
		{
			System.out.println("90 occurs "+ a9 +" times");
		}
	}

}
