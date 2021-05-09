package completecorejavacourse.Arrays;
import java.util.Scanner;
public class LinearSearch6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int key=sc.nextInt();
		int index=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				index=i;
				flag=true;
			} 
		}
		if(flag==true)
		{
			System.out.println("last index of key is" +index);
		}
		else
		{
			System.out.println("key index not found");
		}
	}
}
