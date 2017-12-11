package adventOfCode;

import java.util.Scanner;
import java.io.*;

public class dayOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String fileLocation = new String();
		File file = new File(fileLocation);
		fileLocation = scan.nextLine();

		while (scan.hasNextLine()) {

			System.out.println(file);
		}
		scan.close();

	}

}
