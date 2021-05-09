package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchInArrayList1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		boolean flag=false;
		int index=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++)
		{
			if(key==list.get(i))
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
