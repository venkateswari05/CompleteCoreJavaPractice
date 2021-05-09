package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int n;
		int high=Integer.MAX_VALUE;
		do
		{
			n=sc.nextInt();
			if(n<high && n!=-1)
			{
				high=n;
			}
			
		}while(n!=-1);
		System.out.println("lowest number is " +high);
	}

}
