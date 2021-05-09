package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern(3);
		Pattern(4);
		Pattern(5);
	}
	public static void Pattern(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i +" ");
				
			}
			System.out.println();
		}
	}

}
