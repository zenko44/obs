package workAndEnergy;

import java.util.Scanner;

public class work {
    /*
     * work is defined by force multiply distance multiply Cos theta
     */

    public static double work() {
        double force = 0;
        double distance = 0;
        double theta = 0;
        double work = 0;
        /* 
         * Variables should always be written camelCase with a leading lower case letter
         * for example variableFromHell
         */

        // To work out the The work here.
        while (work == 0) {

			Scanner scan = new Scanner(System.in);

			/*
			 * Work out a way to loop the inputs until the user enters the correct
			 * information.
			 */

			System.out.println("Enter the Value for Force: (in Newtons) ");
			force = scan.nextDouble();

			System.out.println("Enter the Value for the Distance");
			distance = scan.nextDouble();

			System.out.println("Enter the Value for Theta");
			theta = scan.nextDouble();
			while (theta > 360) {
				System.out.println("please use and integer between 0 and 360");
				Theta = scan.nextDouble();
			}


            double thetaRad = Math.toRadians(theta);

            work = force * distance * Math.cos(thetaRad);

			System.out.println(Work + "J");
			scan.close();
		}

        return work;

    }

    public static void main(String[] args) {
        // Numerical values which are set to 0 to allow for the program to run.

		work();
		Energy.energy();
	}
}
