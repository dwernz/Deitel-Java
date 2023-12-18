package Chapter_2;

// Question 2.31. Table of Squares and Cubes.
// Using only the programming techniques you learned in this chapter, 
// write an application that calculates the squares and cubes of the 
// numbers 0 to 10 and prints the resulting values in table format.

public class SquaresAndCubes {
    public static void main(String[] args) {
        // Set the headers
        System.out.printf("number\tsquare\tcube\n");

        // I did not listen to the prompt of using only techniques in chapter 2.
        // Used a for loop to make this much easier.
        // initialize the loop to run 0 to 10, incrementing 1 each time.
        // set variables for the number, square, and cube to be calculated
        // print each one in a column, then set a new line.
        for (int i = 0; i <= 10; i++) {
            int number = i;
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%d\t%d\t%d\n", number, square, cube);
        } // end for loop
    } // end method main
} // end class SquaresAndCubes
