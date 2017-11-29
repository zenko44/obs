package workAndEnergy;

import java.util.Scanner;

public class Energy {

	public static void energy() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you nee to work out Potential Energy or Kinetic Energy?\r" + "Press 1 or 2 ");
		int choose = scan.nextInt();

		while (true) {
			switch (choose) {
			case 1: {
				potentialEnergy.main(null);
				// System.out.println("You picked potential.");
				return;
			}
			case 2: {
				// kineticEnergy.main(null);
				System.out.println("You picked kinetic.");
				return;
			}
			default: {
				System.out.println("You didn't pick anything dumb ass");
				break;
			}

			}

			scan.close();
		}
	}

	public static void main(String[] args) {
		energy();

	}

}
