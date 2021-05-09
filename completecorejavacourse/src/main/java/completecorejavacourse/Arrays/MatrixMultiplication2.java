package completecorejavacourse.Arrays;
import java.util.Scanner;
public class MatrixMultiplication2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[0].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				for(k=0;k<a[0].length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[0].length;j++)
			{
				System.out.println(c[i][j]);
			}
		}
	}
}
