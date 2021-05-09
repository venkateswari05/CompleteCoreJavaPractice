package completecorejavacourse.Arrays;
import java.util.Scanner;
public class NoOfPairsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int index[]=new int[size];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			index[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					if(index[i]==index[j] && index[i]!=-1)
					{
					   count++;
					   index[j]=-1;
					   break;
					}
				}
		}
		System.out.print("number of pairs in the array are ----> " +count);
	}

}
