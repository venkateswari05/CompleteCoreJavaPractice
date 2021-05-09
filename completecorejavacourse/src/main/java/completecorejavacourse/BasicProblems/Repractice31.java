package completecorejavacourse.BasicProblems;

public class Repractice31 {

	public static void main(String[] args)
	{
		int a=15,b=15,c=1;
		int add=a+b+c;
		int mul=a*b*c;
		boolean d=magic(add);
		boolean e=magic(mul);
		print(d);
		print(e);
	}
	private static void print(boolean d) 
	{
		if(d)
		{
			System.out.println("Magic number");
		}
		else
		{
			System.out.println("not a magic number");
		}
	}
	private static boolean magic(int m) {
		int arem,arev=0,ares=1,amul;
		if(m<10)
		{
			m=m*m;
			if(m==1)
			{
				ares=1;
			}	
		}
		while(m>0)
		{
		        arem=m%10;
	            arev=(arev*10)+arem;
	            m=m/10;
		}
		while(arev>=10)
		{
			ares=0;
			while(arev>0)
			{
				arem=arev%10;
				amul=arem*arem;
				ares=ares+amul;
				arev=arev/10;
			}
		    arev=ares;
		}
		if(ares==1)	
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
}
