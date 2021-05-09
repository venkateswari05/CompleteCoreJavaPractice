package completecorejavacourse.Arrays;
import java.util.Scanner;
public class ReadPrintArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
