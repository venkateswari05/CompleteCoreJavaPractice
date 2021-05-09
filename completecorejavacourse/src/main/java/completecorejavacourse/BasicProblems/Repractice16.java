package completecorejavacourse.BasicProblems;

public class Repractice16 {

	public static void main(String[] args) {
		Pattern(7);
		Pattern(8);
	}

	public static void Pattern(int n)
	{
		int ascii=64+n;
		for(int i=0;i<n;i++)
		{
			ascii=64+n-i;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}

		
	}

}
