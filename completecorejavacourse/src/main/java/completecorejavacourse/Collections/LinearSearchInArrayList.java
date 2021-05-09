package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchInArrayList {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		boolean flag=false;
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
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("Not found");
		}
	}

}
