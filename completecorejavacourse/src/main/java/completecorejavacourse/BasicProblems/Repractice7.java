package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=Individual(n);
		System.out.println(result);
	}
		public static int Individual(int n)
		{
			int rem,res=0;
			while(n>9)
			{
				while(n>0)
				{
					rem=n%10;
					res=res+rem;
					n=n/10;
				}
				n=res;
			}
			return n;
		}	
}
