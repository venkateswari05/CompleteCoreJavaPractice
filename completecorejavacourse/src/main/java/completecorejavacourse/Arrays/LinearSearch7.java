package completecorejavacourse.Arrays;
import java.util.Scanner;
public class LinearSearch7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int key=sc.nextInt();
		int index=0,count=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				
				flag=true;
				count++;
			} 
		}
		if(flag==true)
		{
			System.out.println("the no of times key present in array is" +count);
		}
		else
		{
			System.out.println("key  not found");
		}
	}
}
