//CT100/G/21937/24
//ClaaCompoundInterest


import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = Input.nextDouble();

        System.out.print("Enter rate (in percentage): ");
        double rate = Input.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = Input.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("\nCompound Interest: " + compoundInterest);

        Input.close();
    }
}
