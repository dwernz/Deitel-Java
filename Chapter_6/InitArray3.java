package Chapter_6;

// Fig. 6.4: InitArray3.java
// Calculating the values to be placed into the elements of an array

public class InitArray3 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH]; // create array

        // calculate value for each array element
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        } // end for loop

        System.out.printf("%s%8s%n", "Index", "Value");

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        } // end for loop
    } // end method main
} // end class InitArray3