package completecorejavacourse.Collections;

import java.util.ArrayList;

public class TMain {

	public static void main(String[] args) {
		
		ArrayList<Teacher> listOfTeacher = new ArrayList<Teacher>();
		Teacher T= new Teacher();
		Teacher T1= new Teacher(1,"Rajendra","English");
		Teacher T2= new Teacher(2,"Psychoo","Telugu");
		Teacher T3= new Teacher(3,"Swetha","English");
		
		listOfTeacher.add(T);
		listOfTeacher.add(T1);
		listOfTeacher.add(T2);
		listOfTeacher.add(T3);
		
		Teacher T4= new Teacher(4,"Rani","Telugu");
		for(Teacher teacher : listOfTeacher)
		{
			System.out.println(teacher);
		}
		T1.setsubject("Psychoism");
		T4.setname("raj");
		listOfTeacher.add(T4);
		listOfTeacher.remove(T2);
		T3=listOfTeacher.get(0);
		for(Teacher teacher : listOfTeacher)
		{
			System.out.println(teacher);
		}
	}

}
