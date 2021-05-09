package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice13 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Pattern(5);
		Pattern(6);
	}

	public static void Pattern(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=0;j<i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
	}

}
