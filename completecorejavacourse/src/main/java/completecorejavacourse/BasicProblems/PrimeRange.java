package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag!=true)
			{
				System.out.println(i);
			}
		}
}
}
