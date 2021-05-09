package completecorejavacourse.BasicProblems;

public class Repractice47 {

	public static void main(String[] args) {
		int c=Multiply(2,5);
		int d=Multiply(6,7);
		Print(c);
		Print(d);
	}
	private static void Print(int d) {
		System.out.println("Multiplication of two numbers is " +d);
		
	}
	private static int Multiply(int i, int j)
	{
		int c=i*j;
		return c;
	}

}
