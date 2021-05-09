package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rem,count=0;
		int temp=n;
		while(temp>0)
		{
			int fact=1;
			rem=temp%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			count=count+fact;
			temp=temp/10;
		}
		if(count==n)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

}
