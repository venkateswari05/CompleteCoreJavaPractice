package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
    D
   CD
  BCD
 ABCD
 * @author  venkateswari parimi
 *
 */
public class Pattern15 {

	public static void main(String[] args) {
		int n=5;
		int ascii=64+n;
		for(int i=0;i<n;i++)
		{
			ascii=64+n-i;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}

	}

}
