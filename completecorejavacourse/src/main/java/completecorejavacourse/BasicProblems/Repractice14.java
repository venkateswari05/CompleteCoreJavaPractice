package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice14 {

	public static void main(String[] args) {
		Pattern(5);
		Pattern(6);
		Pattern(7);
	}

	public static void Pattern(int n)
	{
		for(int i=0;i<n;i++) 
		{
			int ascii=65;
			for(int j=0;j<=n-i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
	}

}
