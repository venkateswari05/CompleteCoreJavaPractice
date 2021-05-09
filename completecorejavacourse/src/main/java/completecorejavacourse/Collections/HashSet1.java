package completecorejavacourse.Collections;

import java.util.*;
public class HashSet1
{

	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 10;i++)
		{
			set.add(i);
		}
		for(int j=0;j<set.size();j++)
		{
			System.out.println(j);
		}
	}

}
