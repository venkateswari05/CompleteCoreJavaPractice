package completecorejavacourse.Patterns;

import java.util.Scanner;
/**
 * 4
 * 1234
 * 123
 * 12
 * 1
 * @author venkateswari parimi
 *
 */
public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}


	}

}
