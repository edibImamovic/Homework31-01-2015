package ba.bitcamp.edibi.exercises.serializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestSerialization {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		File file = new File("student.txt");

		ArrayList<ClassStudent> student = new ArrayList<>();

		student.add(new ClassStudent("Edib", "Imamovic", 30));
		student.add(new ClassStudent("Jesenko", "Gavric", 27));
		student.add(new ClassStudent("Nermin", "Graca", 30));
		// serialization of ArrayList
		try {

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (ClassStudent s : student) {
				oos.writeObject(s);

			}
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// deserialization of list
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		ArrayList<ClassStudent> studentInput = new ArrayList<>();

		try {
			/**
			 * While true, it will keep reading and putting it to object. When
			 * hit exception it will exit loop.
			 */
			while (true) {

				ClassStudent std = (ClassStudent) ois.readObject();
				studentInput.add(std);

			}
		} catch (EOFException e) {

		}
		// print to console
		for (ClassStudent s : studentInput) {
			System.out.println(s);
		}

	}

}
