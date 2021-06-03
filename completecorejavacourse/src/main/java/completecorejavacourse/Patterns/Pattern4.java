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
	
		
		int n=5,i,j;
		
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
