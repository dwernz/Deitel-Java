package Chapter_7;

// Fig. 7.6: AccountTest2.java
// Using the Account constructor to initialize the name instance
// variable at the time each Account object is created.

public class AccountTest2 {
    public static void main(String[] args) {
        // create two Account objects
        Account2 account1 = new Account2("Jane Green");
        Account2 account2 = new Account2("John Blue");

        // display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    } // end method main
} // end class AccountTest2
