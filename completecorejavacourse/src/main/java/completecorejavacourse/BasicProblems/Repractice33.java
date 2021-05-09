package completecorejavacourse.BasicProblems;

public class Repractice33 {

	public static void main(String[] args) {
		boolean c=Happy(13);
		if(c)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not a happy number");
		}
	}
	private static boolean Happy(int n) {
		int rem,mul,res=0;
		if(n<10)
		{
			n=n*n;
			if(n==1)
			{
				res=1;
			}
		}
		while(n>=10)
		{
			res=0;
			while(n>0)
			{
				rem=n%10;
				mul=rem*rem;
				res=res+mul;
				n=n/10;
			}
		    n=res;
		}
		if(res==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
