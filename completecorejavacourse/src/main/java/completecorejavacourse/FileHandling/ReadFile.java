package completecorejavacourse.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			StringBuffer buffer = new StringBuffer();
			while (myReader.hasNextLine()) {
				buffer.append(myReader.nextLine());
			}
			System.out.println(buffer);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}