package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchInArrayList3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		boolean flag=false;
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++)
		{
			if(key==list.get(i))
			{
				flag=true;
				count++;
			}
		}
		if(flag==true)
		{
			System.out.println("the no of times key present in array is " +count);
		}
		else
		{
			System.out.println("key index not found");
		}

	}

}
