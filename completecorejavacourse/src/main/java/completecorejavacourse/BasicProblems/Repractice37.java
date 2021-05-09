package completecorejavacourse.BasicProblems;

public class Repractice37 {

	public static void main(String[] args) {
		boolean c=Strong(13);
		boolean d=Strong(1);
		boolean e=Strong(25);
		print(c);
		print(d);
		print(e);
	}

	private static void print(boolean c) {
		if(c)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
	}

	private static boolean Strong(int n) {
		int rem,count=0;
		int temp=n;
		while(temp>0)
		{
			int fact=1;
			rem=temp%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			count=count+fact;
			temp=temp/10;
		}
		if(count==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
