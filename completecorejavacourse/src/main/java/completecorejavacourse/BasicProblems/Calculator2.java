package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Calculator2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option,a=5,b=6;
		System.out.println("enter option");
		option=sc.nextInt();
		if(option==1)
		{
			System.out.println(a+b);
		}
		if(option==2)
		{
			System.out.println(a-b);
		}
		if(option==3)
		{
			System.out.println(a*b);
		}
		if(option==4)
		{
			System.out.println(a/b);
		}
		if(option==5)
		{
			System.out.println(a%b);
		}
		for( ;option>5; )
		{
			System.out.println("enter option");
			option=sc.nextInt();
			if(option==1)
			{
				System.out.println(a+b);
			}
			if(option==2)
			{
				System.out.println(a-b);
			}
			if(option==3)
			{
				System.out.println(a*b);
			}
			if(option==4)
			{
				System.out.println(a/b);
			}
			if(option==5)
			{
				System.out.println(a%b);
			}
		}
	}

}
