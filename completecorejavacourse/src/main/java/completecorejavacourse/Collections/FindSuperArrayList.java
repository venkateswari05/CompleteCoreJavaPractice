package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class FindSuperArrayList {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		boolean flag=false;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)+list.get(j)==num)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("super array");
		}
		else
		{
			System.out.println("Psychoo array");
		}
	}
}
