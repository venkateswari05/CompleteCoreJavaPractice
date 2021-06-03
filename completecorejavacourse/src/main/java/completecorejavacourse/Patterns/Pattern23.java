package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 4
*******
 *****
  ***
   *
 * @author parim
 *
 */

public class Pattern23 {

	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
