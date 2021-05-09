package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			if(num==05)
			{
				i--;
			}
			else
			{
				list.add(num);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
