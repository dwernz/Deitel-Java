package Chapter_5;

// Fig. 5.7: RollDie.java
// Roll a dix-sided die 6,000,000 times.
import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        // tally counts for 6,000,000 rolls of a die
        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6.

            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1:
                    ++frequency1; // increase the 1s counter
                    break;
                case 2:
                    ++frequency2; // increase the 2s counter
                    break;
                case 3:
                    ++frequency3; // increase the 3s counter
                    break;
                case 4:
                    ++frequency4; // increase the 4s counter
                    break;
                case 5:
                    ++frequency5; // increase the 5s counter
                    break;
                case 6:
                    ++frequency6; // increase the 6s counter
                    break;

            } // end switch
        } // end for loop

        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3,
                frequency4, frequency5, frequency6);

    } // end method main
} // end class RollDie
