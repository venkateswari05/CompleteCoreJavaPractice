package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * ABCDEF
 * ABCDE
 * ABCD
 * ABC
 * AB
 * @author venkateswari parimi
 *
 */
public class Pattern13 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) 
		{
			int ascii=65;
			for(int j=0;j<=n-i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}

	}

}
