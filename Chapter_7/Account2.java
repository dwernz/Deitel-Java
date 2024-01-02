package Chapter_7;

// Fig. 7.5: Account.java
// Account class with a constructor that initializes the name.

public class Account2 {
    private String name; // instance variable

    // constructor initializes name with parameter name
    public Account2(String name) { // constructor name is class name
        this.name = name;
    } // end constructor Account2

    // method to set the name
    public void setName(String name) {
        this.name = name;
    } // end method setName

    // method to retrieve the name
    public String getName() {
        return name;
    } // end method getName
} // end class Account2
