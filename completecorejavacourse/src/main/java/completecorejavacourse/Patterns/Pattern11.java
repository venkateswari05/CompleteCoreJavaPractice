package completecorejavacourse.Patterns;
import java.util.Scanner;

/**
 * 4
 * A
 * AB
 * ABC
 * ABCD
 * @author venkateswari parimi
 *
 */
public class Pattern11 {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=0;j<i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}

	}

}
