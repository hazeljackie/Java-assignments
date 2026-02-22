//JACQUELINE GITONGA 
//CT100//21937/24

import java.util.Scanner;

public class WaterBill {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter water units consumed: ");
        int units = Input.nextInt();

        double bill;

        if (units <= 30) {
            bill = units * 20;
        } else if (units <= 60) {
            bill = (30 * 20) + ((units - 30) * 25);
        } else {
            bill = (30 * 20) + (30 * 25) + ((units - 60) * 30);
        }

        System.out.printf("Total water bill: %.2f KES%n", bill);

        Input.close();
    }
}
