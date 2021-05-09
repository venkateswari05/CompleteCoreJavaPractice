package completecorejavacourse.BasicProblems;

public class Repractice19 {

	public static void main(String[] args) {
		Pattern(5);
		Pattern(7);
	}

	public static void Pattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}	
	}
}
