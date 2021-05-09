package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0,c=0,rem,res,rev=0;
		int temp1=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int temp=temp1*temp1;
		for(int i=0;i<count;i++)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		while(rev>0)
		{
			res=rev%10;
			c=(c*10)+res;
			rev=rev/10;
		}
		if(c==temp1)
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("not a automorphic number");
		}
	}

}
