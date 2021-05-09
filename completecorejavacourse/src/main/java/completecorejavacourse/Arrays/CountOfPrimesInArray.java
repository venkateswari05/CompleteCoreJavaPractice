package completecorejavacourse.Arrays;
import java.util.Scanner;
public class CountOfPrimesInArray{

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
		int a[][]=new int[size][size];
		int count=0,i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]==1 && a[i][j]==2)
				{
					count++;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				boolean flag=false;
				for(k=2;k<a[i][j];k++)
				{
					if(a[i][j]%k==0)
					{
						flag=true;
					}	
				}
			if(flag!=true)
			{
				count++;
			}
		}
	}
		System.out.println("count of primes in array is " +count);	
 }
}