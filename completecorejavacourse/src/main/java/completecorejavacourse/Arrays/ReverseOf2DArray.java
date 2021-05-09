package completecorejavacourse.Arrays;
import java.util.Scanner;
public class ReverseOf2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				b[size-1-i][size-1-j]=a[i][j];
			}
		}
		System.out.println("Reverse of an array is ");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[0].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
}
}
