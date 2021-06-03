package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 4
 *   A
 *  BBB
 * CCCCC
 *DDDDDDD
 * @author parim
 *
 */
public class Pattern25 {

	public static void main(String[] args) {
		int n=4;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print((char)ascii);
			}
			ascii++;
		    System.out.println();
		}
	}

}
