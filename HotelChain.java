//JACQUELINE GITONGA 
//CT100/G/21937/24
import java.util.Random;

public class HotelChain {

    public static void main(String[] args) {

        int[][][] chain = new int[3][5][10];
        Random rand = new Random();
        int totalOccupied = 0;

        for (int branch = 0; branch < 3; branch++) {
            for (int floor = 0; floor < 5; floor++) {
                for (int room = 0; room < 10; room++) {
                    chain[branch][floor][room] = rand.nextInt(2);
                    if (chain[branch][floor][room] == 1)
                        totalOccupied++;
                }
            }
        }

        System.out.println("Total occupied rooms across all branches: " + totalOccupied);
    }
}
