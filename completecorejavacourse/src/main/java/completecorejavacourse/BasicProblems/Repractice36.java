package completecorejavacourse.BasicProblems;

public class Repractice36 {

	public static void main(String[] args) {
		boolean c=Spy(22);
		if(c)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a spy number");
		}
	}

	private static boolean Spy(int n) {
		int rem,sum=0,mul=1;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n=n/10;
		}
		if(sum==mul)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}
