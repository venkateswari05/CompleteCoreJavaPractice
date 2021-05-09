package completecorejavacourse.BasicProblems;

public class Repractice15 
{
	public static void main(String[] args)
	{
		Pattern(4);
		Pattern(5);
	}

	public static void Pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			int ascii=65;
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
