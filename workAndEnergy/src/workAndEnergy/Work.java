package workAndEnergy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Work {
	/*
	 * work is defined by Force multiply Distance multiply Cos Theta
	 */

	public static double work() {
		double Force = 0;
		double Distance = 0;
		double Theta = 0;
		double Work = 0;

		// To work out the The Work here.
		while (Work == 0) {

			Scanner scan = new Scanner(System.in);
			
			/*
			 * Work out a way to loop the inputs until the user enters the correct
			 * information.
			 */
			while (true) {
				Force = 0;
				try {
					System.out.println("Enter the Value for Force: (in Newtons) ");
					Force = scan.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("You didnt use a number bro");
					break;
				}
				scan.close();
				return Force;
			}

			while (true) {
				Distance = 0;
				try {
					System.out.println("Enter the Value for the Distance");
					Distance = scan.nextDouble();
				} catch (Exception e) {
					System.out.println("You didnt use a number bro");
					break;
				}
				scan.close();
				return Distance;
			}

			while (true) {
				Theta = 0;
				try {
					System.out.println("Enter the Value for Theta");
					Theta = scan.nextDouble();
					while (Theta > 360) {
						System.out.println("please use and integer between 0 and 360");
						Theta = scan.nextDouble();
					}
				} catch (Exception e) {
					System.out.println("You didnt use a number bro");
					break;
				}
				scan.close();
				return Theta;
			}

			double ThetaRad = Math.toRadians(Theta);

			Work = Force * Distance * Math.cos(ThetaRad);

			System.out.println(Work);

		}

		return Work;

	}

	public static void main(String[] args) {
		// Numerical values which are set to 0 to allow for the program to run.

		work();
	}
}
