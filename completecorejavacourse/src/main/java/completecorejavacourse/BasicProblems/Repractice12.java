package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) 
	{
		
		int ascii=65;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((char)ascii +" ");
			}
			ascii++;
			System.out.println();
		}
	}

}
