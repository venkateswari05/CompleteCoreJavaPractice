import java.util.ArrayList;

public class BMain {

	public static void main(String[] args) {
		
		ArrayList<Branch> listOfBranch = new ArrayList<>();
		Branch B= new Branch();
		Branch B1= new Branch(1,"Rajendra");
		Branch B2= new Branch(2,"Psychoo");
		Branch B3= new Branch(3,"Swetha");
		
		listOfBranch.add(B);
		listOfBranch.add(B1);
		listOfBranch.add(B2);
		listOfBranch.add(B3);
		
		Branch B4= new Branch(4,"Rani");
		for(Branch branch : listOfBranch)
		{
			System.out.println(branch);
		}
		B1.setId(11);
		B3.setName("raj");
		listOfBranch.add(B4);
		listOfBranch.remove(B2);
		B3=listOfBranch.get(0);
		for(Branch branch : listOfBranch)
		{
			System.out.println(branch);
		}
	}

}
