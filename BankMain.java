public class BankMain {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("001","Alice",1000);
        BankAccount acc2 = new BankAccount("002","Bob",2000);

        acc1.deposit(500);
        acc1.withdraw(200);

        acc2.deposit(300);
        acc2.withdraw(1000);

        // Display
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
