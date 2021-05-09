package completecorejavacourse.Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample2 
{
	
	public static void main(String[] args)
	{
		HashMap<String,Integer> list = new HashMap<String,Integer>();
		
		String[] list1 = {"P","S","Y","C","H","O","O"};
		String[] list2 = {"P","S","S","C","C","O"};
		
		for(int i = 0;i<list1.length;i++)
		{
			if(list.containsKey(list1[i]))
			{
				list.put(list1[i], list.get(list1[i]) + 1);
			}
			else
			{
				list.put(list1[i], 1);
			}
		}
		
		for(int i = 0;i<list2.length;i++)
		{
			if(list.containsKey(list2[i]))
			{
				list.put(list2[i], list.get(list2[i]) + 1);
			}
			else
			{
				list.put(list2[i], 1);
			}
		}
		
		for(Entry<String,Integer> set : list.entrySet())
		{    
			if(set.getValue()>1)
			{
				System.out.println(set.getKey());
			}
		}
	}
}
