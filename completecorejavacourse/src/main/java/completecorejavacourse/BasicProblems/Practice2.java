package completecorejavacourse.BasicProblems;

import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int m,n,arem,mrev=0,arev=0,ares=1,mres=1,mrem,amul,mmul;
		m=a+b+c;
		n=a*b*c;
		if(m<10 && n<10)
		{
			m=m*m;
			n=n*n;
			if(m==1)
			{
				ares=1;
			}
			if(n==1)
			{
				mres=1;
			}
			
		}
		while(m>0)
		{
		        arem=m%10;
	            arev=(arev*10)+arem;
	            m=m/10;
		}
		while(n>0)
		{
		        mrem=n%10;
	            mrev=(mrev*10)+mrem;
	            n=n/10;
		}
		while(arev>=10)
		{
			ares=0;
			while(arev>0)
			{
				arem=arev%10;
				amul=arem*arem;
				ares=ares+amul;
				arev=arev/10;
			}
		    arev=ares;
		}
		while(mrev>=10)
		{
			mres=0;
			while(mrev>0)
			{
				mrem=mrev%10;
				mmul=mrem*mrem;
				mres=mres+mmul;
				mrev=mrev/10;
			}
		    mrev=mres;
		}
		if(ares==1)	
		{
			System.out.println("addition number is a magic number");
		}
		else if(mres==1)
		{
			System.out.println("Multiplication number is a Magic number");
		}
		else 
		{
			System.out.println("Not a Magic");
		}
	}

}
