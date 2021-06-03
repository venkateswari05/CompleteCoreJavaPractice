package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * DCBA
    CBA
     BA
      A
 * @author venkateswari parimi
 *
 */
public class Pattern12 {
	
	public static void main(String[] args) {
		int n=4;
		int ascii=64+n;
		for(int i=0;i<n;i++)
		{
			ascii=64+n-i;
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print((char)ascii);
				ascii--;
			}
			System.out.println();
		}
	}

}
