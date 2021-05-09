package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a num");
      int n=sc.nextInt();
      int rem;
      int res=0;
      while(n>0)
      {
    	  rem=n%10;
    	  res=res+rem;
    	  n=n/10;
      }
      System.out.println(res);
	}
}
