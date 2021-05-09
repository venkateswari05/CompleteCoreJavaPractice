package completecorejavacourse.Arrays;

public class LinearSearch4 {

	public static void main(String[] args) {
	 Boolean flag=false;
	 int key=9;
	 int a[]= {1,2,3,4,5};
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==key)
		 {
			 flag=true;
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
