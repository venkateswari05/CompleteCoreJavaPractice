package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Repractice8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=Large(5,4,6,7);
		int d=Large(5,3,1,7);
		int e=Large(5,8,6,9);
		int f=Large(5,3,7,0);
		System.out.println(c +" is biggest");
		System.out.println(d +" is biggest");
		System.out.println(e +" is biggest");
		System.out.println(f +" is biggest");
	}
	public static int Large(int a, int b, int c, int d) {
		int result;
		if(a>b && a>c && a>d)
		{
			result=a;
		}
		else if(b>c && b>d)
		{
			result=b;
		}
		else if(c>d)
		{
			result=c;
		}
		else
		{
			result=d;
		}
		return result;
	}

}
