package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondHighestInArrayList {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		int num=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(num>list.get(i))
			{
				num=list.get(i);
			}	
		}
		int num1=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(num1>list.get(i) && list.get(i)!=num)
			{
				num1=list.get(i);
			}	
		}
		System.out.println("second minimum value is " +num1);
	}
}

		