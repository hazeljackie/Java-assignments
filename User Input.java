//JACQUELINE GITONGA
//CT100/G/21937/24

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height (e.g., 1.75): ");
        float height = input.nextFloat();

        System.out.print("Enter your bank balance (KES): ");
        double balance = input.nextDouble();

        System.out.print("Enter your phone number: ");
        String phone = input.next();

        System.out.println("\n--- User Summary ---");
        System.out.println("Height: " + height + " meters");
        System.out.println("Bank Balance: KES " + balance);
        System.out.println("Phone Number: " + phone);
        
        input.close();
    }
}
