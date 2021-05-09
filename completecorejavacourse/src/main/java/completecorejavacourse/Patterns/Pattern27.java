package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * 5
    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII
 * @author venkateswari parimi
 *
 */
public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			if(i!=1)
			{
				ascii=ascii+2;
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<(i*2)-1;j++)
			{
				System.out.print((char)ascii);
			}
			System.out.println();
		}
	}
}
