package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter a number
 * 5
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 5 

 * @author venkateswari parimi
 *
 */

public class Pattern4 {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

}
