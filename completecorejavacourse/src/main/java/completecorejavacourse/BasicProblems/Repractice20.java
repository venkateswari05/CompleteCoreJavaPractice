package completecorejavacourse.BasicProblems;

public class Repractice20 {
	public static void main(String[] args) {
		Pattern(6);
		Pattern(7);
	}
	public static void Pattern(int n) {
		for(int i=0;i<n;i++)
		{
			for (int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}	
	}
}
