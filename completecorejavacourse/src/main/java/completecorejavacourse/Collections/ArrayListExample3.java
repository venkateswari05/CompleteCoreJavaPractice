package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> index=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==key)
			{
				count++;
				index.add(i);
			}
		}
		System.out.print(count +" indexes are ----> ");
		for(int i=0;i<index.size();i++)
		{
			System.out.print(index.get(i) +"  ");
		}
	}
}
