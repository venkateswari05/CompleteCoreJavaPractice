package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int n;
		int high=Integer.MIN_VALUE;
		do
		{
			n=sc.nextInt();
			if(n>high)
			{
				high=n;
			}
			
		}while(n!=-1);
		System.out.println("highest number is " +high);
	}

}
