package completecorejavacourse.BasicProblems;

public class Repractice27 {

	public static void main(String[] args) {
		Pattern(4);
		Pattern(5);
	}

	private static void Pattern(int n) {
		int num=-1;
		for(int i=n;i>0;i--)
		{
				num=num+2;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<(i*2)-1;j++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
