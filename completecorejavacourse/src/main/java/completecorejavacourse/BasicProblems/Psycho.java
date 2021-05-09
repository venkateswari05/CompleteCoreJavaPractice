package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Psycho {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rem,mul,res=0;
		if(n<10)
		{
			n=n*n;
			if(n==1)
			{
				res=1;
			}
		}
		while(n>=10)
		{
			res=0;
			while(n>0)
			{
				rem=n%10;
				mul=rem*rem;
				res=res+mul;
				n=n/10;
			}
		    n=res;
		}
		if(res==1)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not a Happy Number");
		}
	}	
}
