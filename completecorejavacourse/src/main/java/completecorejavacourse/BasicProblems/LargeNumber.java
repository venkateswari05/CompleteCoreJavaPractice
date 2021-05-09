package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class LargeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		System.out.println("enter d");
		int d=sc.nextInt();
		if(a>b && a>c && a>d)
		{
			System.out.println("a is big");
		}
		else if(b>c && b>d)
		{
			System.out.println("b is big");
		}
		else if(c>d)
		{
			System.out.println("c is big");
		}
		else
		{
			System.out.println("d is big");
		}
	}

}
