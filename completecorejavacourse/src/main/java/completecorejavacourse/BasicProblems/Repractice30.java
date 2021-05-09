package completecorejavacourse.BasicProblems;

public class Repractice30 {

	public static void main(String[] args) {
		boolean c=Magic(54);
		boolean d=Magic(13);
		print(c);
		print(d);
	}
	private static boolean Magic(int n) {
		int res=0,rem,mul;
		if(n<9)
		{
			if(n==1)
			{
				res=1;
			}
			n=n*n;
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
	private static void print(boolean c) {
		if(c)
		{
			System.out.println("Magic Number");
		}
		else
		{
			System.out.println("not a magic number");
		}	
	}

}
