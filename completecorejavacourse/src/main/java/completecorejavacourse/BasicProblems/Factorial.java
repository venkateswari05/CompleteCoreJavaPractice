package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		long result=1;
		for(int i=n;i>0;i--)
		{
			result=result*i;
		}
		System.out.println(result);
	}
}
