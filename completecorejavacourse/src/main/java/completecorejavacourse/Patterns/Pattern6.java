package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 4
 * 1
 * 22
 * 333
 * 4444

 * @author venkateswari parimi
 *
 */
public class Pattern6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
