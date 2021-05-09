package completecorejavacourse.Collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> listOfStudent = new ArrayList<Student>();
		Student s= new Student();
		Student s1= new Student(1,"Rajendra","cse");
		Student s2= new Student(2,"Psychoo","cse");
		Student s3= new Student(3,"Swetha","cse");
		
		listOfStudent.add(s);
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		
		Student s4= new Student(4,"Rani","cse");
		for(Student student : listOfStudent)
		{
			System.out.println(student);
		}
		s.setbranch("ece");
		s.setid(5);
		s.setname("raj");
		listOfStudent.add(s4);
		listOfStudent.remove(s2);
		s1=listOfStudent.get(0);
		for(Student student : listOfStudent)
		{
			System.out.println(student);
		}
	}

}
