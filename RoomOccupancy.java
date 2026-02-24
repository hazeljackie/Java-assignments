//JACQUELINE GITONGA 
//CT100/G/21937/24

import java.util.Random;

public class RoomOccupancy {

    public static void main(String[] args) {

        int[][] occupancy = new int[5][10];
        Random rand = new Random();

        for (int floor = 0; floor < 5; floor++) {
            int occupied = 0;
            int vacant = 0;

            for (int room = 0; room < 10; room++) {
                occupancy[floor][room] = rand.nextInt(2);
                if (occupancy[floor][room] == 1)
                    occupied++;
                else
                    vacant++;
            }

            System.out.println("Floor " + (floor + 1) +
                    " → Occupied: " + occupied + ", Vacant: " + vacant);
        }
    }
}
