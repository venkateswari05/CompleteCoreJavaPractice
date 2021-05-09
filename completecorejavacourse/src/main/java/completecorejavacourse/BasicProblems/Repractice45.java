package completecorejavacourse.BasicProblems;

public class Repractice45 {

	public static void main(String[] args) {
		boolean c=Prime(15);
		if(c)
		{
			System.out.println("not Prime");
		}
		else
		{
			System.out.println("prime");
		}
	}

	private static boolean Prime(int n) {
		int i;
		boolean flag=false;
		for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            return true;
        }
        else
        {
            return false;
        }
	}

}
