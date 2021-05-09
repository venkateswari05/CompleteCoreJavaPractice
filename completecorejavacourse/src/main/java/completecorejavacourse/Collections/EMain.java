import java.util.ArrayList;

public class EMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		Employee E= new Employee();
		Employee E1= new Employee(1,"Rajendra",3,true,"SE");
		Employee E2= new Employee(2,"Psychoo",4,false,"SE");
		Employee E3= new Employee(3,"Swetha",5,false,"SE");
		
		listOfEmployee.add(E);
		listOfEmployee.add(E1);
		listOfEmployee.add(E2);
		listOfEmployee.add(E3);
		
		Employee E4= new Employee(4,"Rani",6,true,"SE");
		for(Employee employee : listOfEmployee)
		{
			System.out.println(employee);
		}
		E1.setrole("Manager");
		E2.setid(5);
		listOfEmployee.add(E4);
		listOfEmployee.remove(E4);
		E3=listOfEmployee.get(0);
		for(Employee employee : listOfEmployee)
		{
			System.out.println(employee);
		}
	}

}
