// JACQUELINE GITONGA
//CT100/G/21937/24

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double volume = Math.PI * radius * radius * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);

        input.close();
    }
}
