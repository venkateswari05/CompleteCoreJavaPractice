package completecorejavacourse.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(true)
		{
			int num=sc.nextInt();
			if(num==05)
			{
				break;
			}
			list.add(num);
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
