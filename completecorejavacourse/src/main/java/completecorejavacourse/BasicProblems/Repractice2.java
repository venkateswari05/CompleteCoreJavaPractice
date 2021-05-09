package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 boolean c=Amstrong(n);
		 if(c)
		 {
			 System.out.println("Amstrong Number");
		 }
		 else
		 {
			 System.out.println("not a amstrong number");
		 }
	}
		public static boolean Amstrong(int n)
		{
			int rem,res,count=0;
			int temp=n;
			while(n>0)
			{
				rem=n%10;
				res=rem*rem*rem;
				count=count+res;
				n=n/10;
			}
			if(temp==count)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}
