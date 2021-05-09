package completecorejavacourse.BasicProblems;

public class Repractice50 {

	public static void main(String[] args) {
		Pattern(5);
		Pattern(6);
	}
	private static void Pattern(int n) {
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
		
	}

}
