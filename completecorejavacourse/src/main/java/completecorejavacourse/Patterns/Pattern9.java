package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * @author venkateswari parimi
 *
 */

public class Pattern9 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int ascii=65;
			for(int j=0;j<n;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
	}

}
