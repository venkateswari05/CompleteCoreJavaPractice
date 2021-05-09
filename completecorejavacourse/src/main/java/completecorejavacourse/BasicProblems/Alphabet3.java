package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Alphabet3 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int h=9;
		int w=4;
		for(int i=1;i<=h;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(i==1 || i==h/2+1 || i==h)
				{
					System.out.print(" * ");
				}
				else if(i>h/2+1 && j==w)
				{
					System.out.print(" * ");
				}
				else if(i<h/2+1 && j==1)
				{
					System.out.print(" * ");
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
