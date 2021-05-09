package completecorejavacourse.BasicProblems;

public class repractice26 {

	public static void main(String[] args) {
		Pattern(7);
		Pattern(8);
	}

	private static void Pattern(int n) {
		for(int i=0;i<n;i++)
		{
			int ascii=64+n;
			for(int j=0;j<n-i;j++)
			{
				System.out.print((char)ascii);
				ascii--;
			}
			System.out.println();
		}

	}
}
