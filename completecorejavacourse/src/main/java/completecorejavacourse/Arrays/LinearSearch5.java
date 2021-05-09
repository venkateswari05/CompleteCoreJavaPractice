package completecorejavacourse.Arrays;
import java.util.Scanner;
public class LinearSearch5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int index[]=new int[size];
		System.out.println("enter a num");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==num)
			{
				index[count]=i;
				count++;
			}
		}
		System.out.print(count +" indexes are ----> ");
		for(int i=0;i<count;i++)
		{
			System.out.print(index[i] +"  ");
		}
	}

}
