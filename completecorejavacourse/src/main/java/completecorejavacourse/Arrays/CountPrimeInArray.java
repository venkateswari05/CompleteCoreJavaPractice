package completecorejavacourse.Arrays;
import java.util.Scanner;
public class CountPrimeInArray{

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
		int a[]=new int[size];
		int count=0,i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1 && a[i]==2)
			{
			count++;
			}
		}
		for(i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					flag=true;
				}	
			}
		if(flag!=true)
		{
			count++;
		}
	}
		System.out.println("count of primes in array is " +count);	
 }
}