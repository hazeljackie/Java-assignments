//JACQUELINE GITONGA 
//CT100/G/21937/24


public class ElectricBill {

    public static double calculateElectricBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = (100 * 10) + ((units - 100) * 15);
        } else {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }

        return bill;
    }

    public static void main(String[] args) {
        int units = 250;
        System.out.println("Total Electric Bill: KSh. " + calculateElectricBill(units));
    }
}
