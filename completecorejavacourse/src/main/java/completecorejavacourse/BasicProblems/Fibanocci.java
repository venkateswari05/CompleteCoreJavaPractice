package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,next=1;
		int res=0;
		for(int i=0;i<n;i++)
		{
			res=first+next;
			first=next;
			next=res;
		    System.out.println(res);
		}
	}

}
