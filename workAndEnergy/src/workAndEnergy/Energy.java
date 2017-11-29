package workAndEnergy;

import java.util.Scanner;

public class Energy {

	public static void energy() {
		Scanner scan = new Scanner(System.in);
		int choose = 0;
		System.out.println("Do you nee to work out Potential Energy or Kinetic Energy?\r" + "Press 1 or 2 ");
		while (true) {
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				System.out.println("That wasnt a numerical input.");
			}
			switch (choose) {
			case 1: {
				potentialEnergy.main(null);
				scan.close();

				return;
			}
			case 2: {
				kineticEnergy.main(null);
				scan.close();

				return;
			}
			default: {
				System.out.println("You didn't pick anything dumb ass");
				break;
			}

			}

			
		}
	}

	public static void main(String[] args) {
		energy();

	}

}
