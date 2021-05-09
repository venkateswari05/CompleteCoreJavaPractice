package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rem,res,count=0;
		int temp=n;
		while(temp>0)
		{
			rem=temp%10;
			res=rem*rem*rem;
			count=count+res;
			temp=temp/10;
		}
		if(count==n)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println("not a amstrong");
		}
	}

}
