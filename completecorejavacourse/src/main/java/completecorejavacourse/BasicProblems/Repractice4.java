package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option");
		int option=sc.nextInt();
		int result=Calculator(option);
		System.out.println(result);
	}
		public static int Calculator(int op)
		{
			int a=5,b=6,c=0;
			do 
			{
				if(op==1)
				{
					c=a+b;
				}
				else if(op==2)
				{
					c=a-b;
				}
				else if(op==3)
				{
					c=a*b;
				}
				else if(op==4)
				{
					c=a/b;
				}
				else if(op==5)
				{
					c=a%b;
				}
			}while(op>5);
			return c;
        }
}
