public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "Sumit", 5000);
        BankAccount account2 = new BankAccount(102, "Rahul", 8000);

        System.out.println("----- Account 1 Operations -----");

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();

        System.out.println("\n----- Account 2 Operations -----");

        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        System.out.println("\n----- Final Account Details -----");

        System.out.println("\nAccount 1:");
        account1.displayDetails();

        System.out.println("\nAccount 2:");
        account2.displayDetails();
    }
}
