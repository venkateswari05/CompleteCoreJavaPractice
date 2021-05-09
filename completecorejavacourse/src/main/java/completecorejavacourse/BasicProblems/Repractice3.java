package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean c=Automorphic(n);
		if(c)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("Not a automorphic number");
		}
	}
		public static boolean Automorphic(int n)
		{
			int count=0,d=0,rem,res,rev=0;
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
				d=(d*10)+res;
				rev=rev/10;
			}
			if(d==temp1)
			{
				return true;
			}
			else
			{
				return false;
			}

	}

}
