package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class PascalTraingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int left=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(" " +(left+i));
			}
			System.out.println();
		}
	}

}
