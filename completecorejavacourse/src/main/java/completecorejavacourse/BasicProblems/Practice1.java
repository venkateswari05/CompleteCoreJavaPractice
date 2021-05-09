package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a value");
		int n=sc.nextInt();
		int res=0,rem,mul;
		if(n<9)
		{
			if(n==1)
			{
				res=1;
			}
			n=n*n;
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
			System.out.println("Magic Number");
		}
		else
		{
			System.out.println("not a magic number");
		}
	}

}
