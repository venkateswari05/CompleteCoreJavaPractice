package completecorejavacourse.BasicProblems;

public class Repractice38 {

	public static void main(String[] args) {
		Sum(145);
	}

	private static void Sum(int n) {
		int rem;
	      int res=0;
	      while(n>0)
	      {
	    	  rem=n%10;
	    	  res=res+rem;
	    	  n=n/10;
	      }
	      System.out.println(res);
	}
}
