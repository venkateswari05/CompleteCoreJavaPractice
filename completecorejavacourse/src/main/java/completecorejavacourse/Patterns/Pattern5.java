package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter a value
 *  4
 * 4 4 4 4 
 * 3 3 3 3 
 * 2 2 2 2 
 * 1 1 1 1
 * @author venkateswari parimi
 *
 */
public class Pattern5 {

	public static void main(String[] args)
	{
          Scanner sc=new Scanner(System.in);
          int n,i,j;
          System.out.println("enter a value");
          n=sc.nextInt();
          for(i=0;i<n;i++)
          {
        	  for(j=0;j<n;j++)
        	  {
        		  System.out.print(n-i +" ");
        	  }
        	  System.out.println();
          }
	}

}
