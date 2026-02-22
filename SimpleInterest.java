//JACQUELINE GITONGA
//ClassSimpleInterest

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Enter principal amount: ");
            double principal = Input.nextDouble();
            
         
            System.out.print("Enter time (in years): ");
            double time = Input.nextDouble();
            
            System.out.print("Enter rate (in percentage): ");
            double rate = Input.nextDouble();
            
         
            double simpleInterest = (principal * time * rate) / 100;
            
           
            System.out.println("\nSimple Interest: " + simpleInterest);
        }
    }
}
