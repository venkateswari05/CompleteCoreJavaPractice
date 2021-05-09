package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean result=Leapyear(n);
		if(result)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
	public static boolean Leapyear(int n) 
	{
		if(n%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
