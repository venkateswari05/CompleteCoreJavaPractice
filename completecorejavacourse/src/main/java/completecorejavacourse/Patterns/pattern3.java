package completecorejavacourse.Patterns;

import java.util.Scanner;

/**
 * enter a value
 * 7
 * 7 7 7 7 7 7 7 
 * 6 6 6 6 6 6 6 
 * 5 5 5 5 5 5 5 
 * 4 4 4 4 4 4 4 
 * 3 3 3 3 3 3 3 
 * 2 2 2 2 2 2 2 
 * 1 1 1 1 1 1 1
 * @author venkateswari parimi
 *
 */
public class pattern3 {

	public static void main(String[] args)
	{
        
          int i,j;
          int n=7;
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
