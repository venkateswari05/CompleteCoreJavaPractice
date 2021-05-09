package completecorejavacourse.BasicProblems;

public class Repractice41 {

	public static void main(String[] args) {
		int c=reverse(123);
		System.out.println(c);
	}

	private static int reverse(int n) 
	{
		int rem,rev=0;
		while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
         return rev;
	}

}
