package Chapter_6;

// Fig. 6.14: InitArray5.java
// Initializing an array using command-line arguments.

public class InitArray5 {
    public static void main(String[] args) {
        // check number of command-line argumnets
        if (args.length != 3) {
            System.out.printf("Error: Please re-enter the entire command, including%n"
                    + "an array size, initial value, and increment.%n");
        } // end if statement
        else {
            // get array size from first command-line argumnet
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculate value for each array element
            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            } // end for loop

            System.out.printf("%s%8s%n", "Index", "Value");

            // display array index and value
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            } // end for loop
        } // end else statement
    } // end method main
} // end class InitArray5
