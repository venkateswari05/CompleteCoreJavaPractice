package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class NeonNumber
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	int n=sc.nextInt();
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
		System.out.println("Neon Number");
	}
	else
	{
		System.out.println("Not a Neon Number");
	}
}
}