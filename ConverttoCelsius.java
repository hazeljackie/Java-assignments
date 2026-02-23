//JACQUELINE GITONGA
//CT100/G/21937/24

public class ConverttoCelsius {

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double tempF = 98.6;
        System.out.println("Temperature in Celsius: " + convertToCelsius(tempF));
    }
}
