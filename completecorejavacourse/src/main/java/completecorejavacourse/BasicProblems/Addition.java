package completecorejavacourse.BasicProblems;

import java.util.Scanner;

  class Addition {

	public static void main(String[] args) {

      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      c=a+b;
      System.out.println("Addition of two numbers is" +c); 
      sc.close();
	}

}

