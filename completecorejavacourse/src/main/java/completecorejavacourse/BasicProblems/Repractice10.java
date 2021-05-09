package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean c=Neon(n);
		if(c)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("not a neon number");
		}
	}
	public static boolean Neon(int n) 
	{
		int rem,count=0,temp=n;
		temp=temp*temp;
		while(temp>0)
		{
			rem=temp%10;
			count=count+rem;
			temp=temp/10;
		}
		if(count==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
