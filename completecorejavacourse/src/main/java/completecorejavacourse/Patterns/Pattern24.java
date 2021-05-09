package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
 *   1
 *  333
 * 55555
 * 7777777
 *999999999
 * @author parim
 *
 */
public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=-1;
		for(int i=1;i<=n;i++)
		{
				num=num+2;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<(i*2)-1;j++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
