package completecorejavacourse.BasicProblems;

public class Repractice17 {

	public static void main(String[] args) {
		Pattern(5);
		Pattern(6);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
		
	}

}
