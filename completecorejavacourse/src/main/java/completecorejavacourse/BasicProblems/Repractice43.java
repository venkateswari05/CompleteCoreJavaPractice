package completecorejavacourse.BasicProblems;

public class Repractice43 {

	public static void main(String[] args) {
		Pattern(5);
		Pattern(7);

	}

	private static void Pattern(int n) {
		int i,j,h=5,w=5;
		for(i=0;i<h;i++)
        {
            for(j=0;j<w;j++)
            {
                if(i==0 || j==0 || i==(h-1) || j==(w-1))
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
		
	}

}
