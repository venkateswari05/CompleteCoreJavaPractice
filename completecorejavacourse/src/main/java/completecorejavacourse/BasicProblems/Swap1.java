package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Swap1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=5,b=4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is " +a +" b is " +b);
	}

}
