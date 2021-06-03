package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter n value
 * 6
     1
    11
   111
  1111
 11111
111111

 * @author venkateswari parimi
 *
 */
public class Pattern19 {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++)
		{
			for (int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
