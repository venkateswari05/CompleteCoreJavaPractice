package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Fibonacci(n);
	}
	public static void Fibonacci(int n) 
	{
		int first=0,next=1;
		int res=0;
		for(int i=0;i<n;i++)
		{
			res=first+next;
			first=next;
			next=res;
			System.out.println(res);
		}
	}
}
