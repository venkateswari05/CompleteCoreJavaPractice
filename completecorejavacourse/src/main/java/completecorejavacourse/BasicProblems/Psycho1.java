package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Psycho1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b*b+c*c)
		{
			System.out.println("a is magic number");
		}
		else if(b==a*a+c*c)
		{
			System.out.println("b is magic number");
		}
		else if(c==a*a+b*b)
		{
			System.out.println("c is magic number");
		}
		else
		{
			System.out.println("there is no magic number in a,b,c");
		}
	}

}
