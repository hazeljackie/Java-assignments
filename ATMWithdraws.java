//JACQUELINE GITONGA
//CT100/G/21937/24

import java.util.Scanner;

public class ATMWithdraws {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        double balance;

        System.out.print("Enter initial account balance: ");
        balance = Input.nextDouble();

        while (balance > 0) {
            System.out.print("Enter amount to withdraw: ");
            double withdraw = Input.nextDouble();

            balance -= withdraw;

            if (balance <= 0) {
                System.out.println("Balance is zero or negative. Cannot withdraw further.");
                break;
            }

            System.out.println("Remaining balance: " + balance);
        }

        Input.close();
    }
}
