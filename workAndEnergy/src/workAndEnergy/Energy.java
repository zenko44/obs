package workAndEnergy;

import java.util.Scanner;

public class Energy {

	public static void energy() {
		Scanner scan = new Scanner(System.in);
		int choose = 0;
		System.out.println("Do you nee to work out Potential Energy or Kinetic Energy?\r"
				+ "Press 1 for Potential energy \r2 for Kinetic energy \ror 3 for Work");
		while (choose == 0) {
			if(choose != 0) {
				choose = 0;
			}
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
			case 3: {
				Work.main(null);
				scan.close();
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
