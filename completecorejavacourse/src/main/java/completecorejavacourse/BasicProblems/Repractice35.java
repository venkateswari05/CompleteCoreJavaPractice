package completecorejavacourse.BasicProblems;

public class Repractice35 {

	public static void main(String[] args)
	{
		int a=1,b=1,c=1;
		int d=Large(a,b,c);
		if(d==a)
		{
			System.out.println("a is magic number");
		}
		if(d==b)
		{
			System.out.println("b is magic number");
		}
		if(d==c)
		{
			System.out.println("c is magic number");
		}
		else
		{
			System.out.println("there is no magic number in a,b,c");
		}
	}
	private static int Large(int a, int b, int c)
	{
		int result=0;
		if(a==b*b+c*c)
		{
			result=a;
		}
		if(b==a*a+c*c)
		{
			result=b;
		}
		if(c==a*a+b*b)
		{
			result=c;
		}
		return result;
	}

}
