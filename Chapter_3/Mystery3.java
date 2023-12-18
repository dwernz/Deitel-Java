package Chapter_3;

// Exercise 3.26: Mystery3.java

public class Mystery3 {
    public static void main(String[] args) {
        int row = 10;

        while (row >= 1) {
            int column = 1;

            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            } // end while loop

            --row;
            System.out.println();
        } // end while loop
    } // end method main
} // end class Mystery3
