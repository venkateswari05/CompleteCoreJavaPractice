package completecorejavacourse.Collections;

import java.util.ArrayList;

public class GMain {

	public static void main(String[] args) {
		
		ArrayList<Gender> listOfGender = new ArrayList<Gender>();
		Gender G= new Gender();
		Gender G1= new Gender("Rajendra","FeMale");
		Gender G2= new Gender("Psychoo","Female");
		Gender G3= new Gender("Swetha","Female");
		
		listOfGender.add(G);
		listOfGender.add(G1);
		listOfGender.add(G2);
		listOfGender.add(G3);
		
		Gender G4= new Gender("Rajendra","FeMale");
		for(Gender Gender : listOfGender)
		{
			System.out.println(Gender);
		}
		G4.settype("Female");
		G4.setName("rani");
		listOfGender.add(G4);
		listOfGender.remove(G3);
		G3=listOfGender.get(0);
		for(Gender gender : listOfGender)
		{
			System.out.println(gender);
		}
	}

}
