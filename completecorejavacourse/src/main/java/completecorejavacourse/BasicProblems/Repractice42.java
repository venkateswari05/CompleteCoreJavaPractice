package completecorejavacourse.BasicProblems;

public class Repractice42 {

	public static void main(String[] args) 
	{
		boolean c=Perfect(31);
		boolean d=Perfect(23);
		boolean e=Perfect(6);
		print(c);
		print(d);
		print(e);
	}
	private static void print(boolean c) {
		if(c)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
		
	}
	private static boolean Perfect(int n) {
		int i,count=0;
		  for(i=1;i<n;i++)
	        {
	            if(n%i==0)
	            {
	                count=count+i;
	            }
	        }
	        if(n==count)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	}

}
