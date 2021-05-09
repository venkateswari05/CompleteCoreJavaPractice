package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
		int n=sc.nextInt();
		if(n%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("not a Leap Year");
		}

	}

}
