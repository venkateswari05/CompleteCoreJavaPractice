package completecorejavacourse.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class NoOfPairsInArrayList
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++)
		{
				for(int j=i+1;j<list.size();j++)
				{
					if(list.get(i)==list.get(j))
					{
					   count++;
					   list.remove(j);
					   break;
					}
				}
		}
		System.out.print("number of pairs in the array are ----> " +count);
	}
}