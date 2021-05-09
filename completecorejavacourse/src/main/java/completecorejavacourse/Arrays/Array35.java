package completecorejavacourse.Arrays;
import java.util.Scanner;
public class Array35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int count;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
				count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j] && a[j]!=-1)
					{
					   count++;
					   a[j]=-1;
					}
				}
				b[i]=count;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.println(a[i] +" occurs " +b[i] +" times");
		}
	}

}
