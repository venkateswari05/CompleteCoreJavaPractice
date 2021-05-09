package completecorejavacourse.BasicProblems;

public class Repractice40 {

	public static void main(String[] args) {
		Swap(4,5);

	}

	private static void Swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is " +a +" b is " +b);
	}
}
