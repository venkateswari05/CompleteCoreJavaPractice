package completecorejavacourse.BasicProblems;

public class Repractice32 {

	public static void main(String[] args) {
		Prime(100);
	}
	private static void Prime(int n)
	{
		boolean flag=false;
		for(int i=1;i<n;i++)
		{
			flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag!=true)
			{
				System.out.println(i);
			}
		}
	}
}
