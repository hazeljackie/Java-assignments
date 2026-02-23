//JACQUELINE GITONGA
//CT100/G/21937/24


public class CalculateFare {

    public static double calculateFare(double distance) {
        return distance * 50;
    }

    public static void main(String[] args) {
        double distance = 10;
        System.out.println("Total Fare: KSh. " + calculateFare(distance));
    }
}
