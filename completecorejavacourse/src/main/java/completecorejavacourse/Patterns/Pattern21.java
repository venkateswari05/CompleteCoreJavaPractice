package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 4
 * DCBA
 * DCB
 * DC
 * D
 * @author venkateswari parimi
 *
 */
public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int ascii=64+n;
			for(int j=0;j<n-i;j++)
			{
				System.out.print((char)ascii);
				ascii--;
			}
			System.out.println();
		}

	}

}
