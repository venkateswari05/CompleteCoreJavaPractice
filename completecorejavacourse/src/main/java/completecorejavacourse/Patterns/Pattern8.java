package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 4
 * 1 1 1 1 
 * 2 2 2 
 * 3 3 
 * 4 
 * @author venkateswari parimi
 *
 */
public class Pattern8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
