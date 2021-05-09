package completecorejavacourse.BasicProblems;

public class Repractice46 {

	public static void main(String[] args) {
		boolean c=Positive(25);
		boolean d=Positive(-23);
		print(c);
		print(d);
	}

	private static void print(boolean c) {
		if(c)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("negative number");
		}
		
	}

	private static boolean Positive(int n) {
		if(n>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
	}

}
