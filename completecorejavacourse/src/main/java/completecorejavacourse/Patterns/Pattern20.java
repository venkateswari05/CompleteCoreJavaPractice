package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
 * EEEEE
 * DDDD
 * CCC
 * BB
 * A
 * @author venkateswari parimi
 *
 */
public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ascii=64+n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print((char)ascii);
			}
			ascii--;
			System.out.println();
		}


	}

}
