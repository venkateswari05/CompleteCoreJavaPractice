package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter n value
 * 3
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 
 * @author parim
 *
 */

public class Pattern2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
