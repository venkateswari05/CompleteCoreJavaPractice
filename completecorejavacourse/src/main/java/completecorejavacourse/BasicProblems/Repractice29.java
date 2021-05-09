package completecorejavacourse.BasicProblems;

public class Repractice29 {

	public static void main(String[] args) {
		Pattern(6);
		Pattern(7);
	}

	private static void Pattern(int n) {
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
		
	}

}
