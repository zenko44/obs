package workAndEnergy;

import java.util.Scanner;
import java.io.*;

public class Work {
	/*
	 * work is defined by Force multiply Distance multiply Cos Theta
	 */

	public static void main(String[] args) {
		// Numerical values which are set to 0 to allow for the program to run.
		double Force = 0;
		double Distance = 0;
		double Theta = 0;
		double Work = 0;

		// To work out the The Work here.
		while (Work == 0) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the Value for Force: ");
			Force = scan.nextDouble();

			System.out.println("Enter the Value for the Distance");
			Distance = scan.nextDouble();

			System.out.println("Enter the Value for Theta");
			Theta = scan.nextDouble();

			// System.out.println(Force);

			if (Theta == 0) {
				Theta = 1;
			}
			// work out how to turn it into a negative integer if 180 is the value of Theta
			/*
			 * if(Theta == 180){ Theta = -1; }
			 */

			while (Theta >= 360) {
				System.out.println("please use and integer between 0 and 360");
				Theta = scan.nextDouble();
			}

			double ThetaRad = Math.toRadians(Theta);

			Work = Force * Distance * Math.cos(ThetaRad);

			if (Theta == 180) {
				System.out.printf("-", Work);
			} else {
				System.out.println(Work);
			}
		}
	}
}
