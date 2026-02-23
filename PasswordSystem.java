//JACQUELINE GITONGA
//CT100/G/21937/24


import java.util.Scanner;

public class PasswordSystem {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String password;
        final String CORRECT_PASSWORD = "1234";

        do {
            System.out.print("Enter password: ");
            password = Input.next();
        } while (!password.equals(CORRECT_PASSWORD));

        System.out.println("Access Granted");
        Input.close();
    }
}
