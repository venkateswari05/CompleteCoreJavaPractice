package completecorejavacourse.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class CountOfPrimesArrayList
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		boolean flag=false;
		int count=0,i=1;
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		while(count<n)
		{
				flag=false;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=true;
						break;
					}	
				}
				if(flag==false)
				{
					count++;
					newlist.add(i);
				}
				i++;
		}
		for(i=0;i<newlist.size();i++)
		{
			System.out.println(newlist.get(i));
		}
	}

}
