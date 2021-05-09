package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option,a=5,b=6;
		do {
			System.out.println("enter option");
			option=sc.nextInt();
			if(option==1)
			{
				System.out.println(a+b);
			}
			if(option==2)
			{
				System.out.println(a-b);
			}
			if(option==3)
			{
				System.out.println(a*b);
			}
			if(option==4)
			{
				System.out.println(a/b);
			}
			if(option==5)
			{
				System.out.println(a%b);
			}
		}while(option>5);
}
}