package workAndEnergy;

import java.util.Scanner;

public class Work {
	/*
	 * work is defined by Force multiply Distance multiply Cos Theta
	 */

	@SuppressWarnings("resource")
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

			if (Theta == 0) {
				Theta = 1;
			}

			while (Theta > 360) {
				System.out.println("please use and integer between 0 and 360");
				Theta = scan.nextDouble();
			}

			double ThetaRad = Math.toRadians(Theta);

			Work = Force * Distance * Math.cos(ThetaRad);

			System.out.println(Work);

		}
	}
}
