package completecorejavacourse.BasicProblems;

public class Repractice44 {

	public static void main(String[] args) {
		Pattern(5);

	}

	private static void Pattern(int n) {
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n-i;j++);
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i-j);
			}
			
			System.out.println();
		}
	}
}
