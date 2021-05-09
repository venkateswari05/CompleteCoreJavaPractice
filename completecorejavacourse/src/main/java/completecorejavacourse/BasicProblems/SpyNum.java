package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class SpyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,sum=0,mul=1;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n=n/10;
		}
		if(sum==mul)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
	}

}
