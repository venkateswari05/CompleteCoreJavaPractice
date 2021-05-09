package completecorejavacourse.BasicProblems;

import  java.util.Scanner;
public class Repractice5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int result=Factorial(n);
		System.out.println(result);
	}
	public static int Factorial(int n)
	{
		int result=1;
		for(int i=n;i>0;i--)
		{
			result=result*i;
		}
		return result;
	}

}
