import java.util.ArrayList;

public class RMain {

	public static void main(String[] args) {
		
		ArrayList<Role> listOfRole = new ArrayList<>();
		Role r= new Role();
		Role r1= new Role(1,"Rajendra",true);
		Role r2= new Role(2,"Psychoo",false);
		Role r3= new Role(3,"Swetha",true);
		
		listOfRole.add(r);
		listOfRole.add(r1);
		listOfRole.add(r2);
		listOfRole.add(r3);
		
		Role r4= new Role(4,"Rani",false);
		for(Role role : listOfRole)
		{
			System.out.println(role);
		}
		r1.setid(5);
		r4.setname("raj");
		listOfRole.add(r4);
		listOfRole.remove(r2);
		r1=listOfRole.get(0);
		for(Role role : listOfRole)
		{
			System.out.println(role);
		}
	}

}
