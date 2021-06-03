package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 6
     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
ABCDEFGHIJK
 * @author venkateswari parimi
 *
 */
public class Pattern28 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
		
	}
}
