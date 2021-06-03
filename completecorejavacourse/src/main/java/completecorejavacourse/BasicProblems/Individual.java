package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Individual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,res=0;
		while(n>9)
		{
			res=0;
			while(n>0)
			{
				rem=n%10;
				res=res+rem;
				n=n/10;
			}
			n=res;
		}
		System.out.println(n);
	}
}
