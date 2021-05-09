package completecorejavacourse.BasicProblems;

public class Repractice39 {

	public static void main(String[] args) {
		Swap(5,6);
	}

	private static void Swap(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a is" +a +" b is " +b);
	}

}
