//JACQUELINE GITONGA
//class Bankloan

import java.util.Scanner;

public class BankLoan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Prompt user for annual income
        System.out.print("Enter your annual income (in KES): ");
        double income = input.nextDouble();

        // Check loan eligibility
        if (age >= 21 && income >= 21000) {
            System.out.println("Congratulations you qualify for a loan.");
        } else {
            System.out.println("Unfortunately, we are unable to offer you a loan at this time.");
        }

        input.close();
    }
}
