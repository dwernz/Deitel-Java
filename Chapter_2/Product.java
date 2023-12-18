package Chapter_2;

// Ex. 2.6: Product.java
// Calculate the product of three integers.
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window.
        Scanner input = new Scanner(System.in);

        int x, y, z, result; // first, second, third input by user, and product of numbers.

        System.out.print("Enter first integer: "); // prompt for input
        x = input.nextInt(); // read first integer

        System.out.print("Enter second integer: "); // prompt for input
        y = input.nextInt(); // read second integer

        System.out.print("Enter third integer: "); // prompt for input
        z = input.nextInt(); // read third integer

        result = x * y * z; // calculate product of numbers

        System.out.printf("Product is %s%n", result);

        input.close();
    } // end method main
} // end class Product
