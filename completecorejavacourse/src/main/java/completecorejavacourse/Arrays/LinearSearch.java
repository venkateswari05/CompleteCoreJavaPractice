package completecorejavacourse.Arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 int a[][]=new int[size][size];
	 Boolean flag=false;
	 int key=9;
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[0].length;j++)
		 {
			 a[i][j]=sc.nextInt();
		 }
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[0].length;j++)
		 {
			 if(a[i][j]==key)
			 {
				 flag=true;
			 } 
		 }
	 }
	 if(flag==true)
	 {
		 System.out.println("key found");
	 }
	 else
	 {
		 System.out.println("key not found");
	 }
	}
}
