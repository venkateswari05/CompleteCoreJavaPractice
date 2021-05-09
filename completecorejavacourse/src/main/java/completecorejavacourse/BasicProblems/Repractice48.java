package completecorejavacourse.BasicProblems;

public class Repractice48 {

	public static void main(String[] args) {
		boolean c=Evenodd(22);
		boolean d=Evenodd(35);
		Print(c);
		Print(d);

	}

	private static boolean Evenodd(int a) 
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static void Print(boolean a) 
	{
		if(a)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}

}
