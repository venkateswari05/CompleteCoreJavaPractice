package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter n value
 * 5
 * 54321
    4321
     321
      21
       1 
 * @author venkateswari parimi
 *
 */
public class Pattern17 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
