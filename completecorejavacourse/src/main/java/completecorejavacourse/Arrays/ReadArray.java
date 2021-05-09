package completecorejavacourse.Arrays;
import java.util.Scanner;
public class ReadArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
}