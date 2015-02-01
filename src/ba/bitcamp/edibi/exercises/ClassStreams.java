package ba.bitcamp.edibi.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Edib Imamovic
 *
 */
public class ClassStreams {

	public static void main(String[] args) {
		/**
		 * @Try and catch with Exception if file not found.
		 */
		File file;
		PrintWriter pw = null;

		try {
			file = new File("test.txt"); // input to file, where path is ---
											// ("test.txt")
			pw = new PrintWriter(file); // PrintWriter Class with file input
			pw.println("Edib Imamovic");
			pw.println(30);

			Scanner sc = new Scanner(file);
			String name = sc.nextLine();
			int age = sc.nextInt();
			System.out
					.printf("Moje ime je %s, i ja imam %d godina.", name, age);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}
