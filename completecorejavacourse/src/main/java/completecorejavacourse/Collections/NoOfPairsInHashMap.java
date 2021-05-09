package completecorejavacourse.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class NoOfPairsInHashMap {
	
	int i = 10;

	public static void main(String[] args)
	{
		int arr[] = {1,2,1,2,3,3,4,5,5,6,6};
		int arr1[] = {1,4,3,5,6,7,3,5,9,6,7};
		
		NoOfPairsInHashMap obj = new NoOfPairsInHashMap();
		NoOfPairs(arr);
		obj.SetOfPairs(arr1);
		obj.GetPairs(arr);
	}

	private void GetPairs(int[] arr)
	{
		HashMap<Integer,Integer> list2 = new HashMap<Integer,Integer>();
		int pair = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(list2.containsKey(arr[i]))
			{
				if(list2.get(arr[i]) == 1)
				{
					pair++;
					list2.put(arr[i], 0);
				}
				else
				{
					list2.put(arr[i], 1);
				}
			}
			else
			{
				list2.put(arr[i], 1);
			}
		}
		System.out.println("No of pairs:" +pair);
	}

	private void SetOfPairs(int[] arr1)
	{
		HashMap<Integer,Integer> list1 = new HashMap<Integer,Integer>();
		int pair = 0;
		for(int i : arr1)
		{
			if(list1.containsKey(i))
			{
				list1.remove(i);
				pair++;
			}
			else
			{
				list1.put(i,1);
			}
		}
		System.out.println("No of pairs:" +pair);
	}

	private static void NoOfPairs(int a[]) 
	{
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		for(int i : a)
		{
			if(list.containsKey(i))
			{
				int val = list.get(i);
				list.put(i,val+1);
			}
			else
			{
				list.put(i,1);
			}
		}
		int pair = 0;
		for(Entry<Integer,Integer> e : list.entrySet())
		{
			pair = pair + (e.getValue()/2);
		}
		System.out.println("No of pairs:" +pair);
	}

}
