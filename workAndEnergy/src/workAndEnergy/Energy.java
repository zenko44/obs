package workAndEnergy; 
/* Needs to be given a reverse DNS name with all lower case
 * ie. com.stevelacy.work_and_energy
 * or com.stevelacy.energy
 * the convention is to use your domain name if you have one. Mine would be
 * uk.co.boxler.<packagename>
 */

import java.util.Scanner;

/*
 * Hey Steve, you should definitely read this. It is going to be best 
 * to get you into good coding practices now, before they become too 
 * ingrained again. 
 * http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 */

public class Energy {

    public static void energy() {
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        System.out.println("Do you need to work out Potential Energy or Kinetic Energy?\rPress 1 or 2 ");
            // No need to concatinate above line
            
        while (true) {
            try {
                choose = scan.nextInt();
            } catch (Exception e) {
                System.out.println("That wasnt a numerical input.");
            }
            switch (choose) {
            case 1: {
                PotentialEnergy.main(null);
                scan.close();

                return;
            }
            case 2: {
                KineticEnergy.main(null);
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
