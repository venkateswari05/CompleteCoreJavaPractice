package completecorejavacourse.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] arr = {5, 10, 15, 20, 10, 5, 15, 24, 34};
		for(int num : arr)
		{
			if(map.containsKey(num))
			{
				int value = map.get(num);
				map.put(num,value+1);
			}
			else
			{
				map.put(num, 1);
			}
		
		}
		for(Map.Entry m : map.entrySet())
		{    
			   System.out.println(m.getKey()+"   "+m.getValue());    
	    }
	}
}
