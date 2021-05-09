package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Alphabet4 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		for(int i=1;i<=h;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(i==1 || j==1 || j==w || i==h/2+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
