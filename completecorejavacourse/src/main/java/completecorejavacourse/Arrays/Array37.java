package completecorejavacourse.Arrays;
import java.util.*;

public class Array37
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0)
        {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            boolean flag=true;
            int[] game = new int[n];
            for (int i = 0; i < game.length; i++)
            {
               game[i] = scan.nextInt();
            }
            int i=0;
            while(i<n)
            {
                if(i+leap==0)
                {
                    i=game[i+leap];
                }
                else if(game[i+1]==0)
                {
                    i=game[i+1];
                }
                else if(i+leap>=n)
                { 
                	flag=true; 
                	break;
                }
                else
                {
                	flag=false;
                	break;
                }
            }
            if(flag==false)
            {
            	System.out.println("No");
            }
            else
            {
            	System.out.println("Yes");
            }
        }
    }
}