package completecorejavacourse.Collections;

import java.util.HashMap;
import java.util.*;
public class HashMapExample
{  
	public static void main(String args[])
	{  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();   
	   map.put(1,"Mango");  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");   
	   System.out.println("actual List");  
	   for(Map.Entry m : map.entrySet())
	   {    
		   System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	   
	   map.put(5,"Dragon");  
	   map.putAll(map); 
	   System.out.println("Added List");  
	   for(Map.Entry m : map.entrySet())
	   {    
		   System.out.println(m.getKey()+" "+m.getValue());    
	   } 
	   
	   map.remove(1); 
	   map.remove(2); 
	   System.out.println("Removed List");  
	   for(Map.Entry m : map.entrySet())
	   {    
		   System.out.println(m.getKey()+" "+m.getValue());    
	   } 
	   
	   map.replace(5, "Mango");
	   System.out.println("New List");  
	   for(Map.Entry m : map.entrySet())
	   {    
		   System.out.println(m.getKey()+" "+m.getValue());    
	   } 
	}
}  

