package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
111111111
 3333333
  55555
   777
    9
 * @author venkateswari parimi
 *
 */
public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=-1;
		for(int i=n;i>0;i--)
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
