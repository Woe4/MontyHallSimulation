import java.util.ArrayList;
import java.util.Random;

public class Doors {
    private ArrayList<Boolean> doors;

    // EFFECTS: creates a list of 3 boolean values with one (and only one) true
    public Doors() {
        doors = new ArrayList<>();

        Random rand = new Random();
        int winNumber = rand.nextInt(3);

        for (int i = 0; i < 3; i++) {
            if (winNumber == i) {
                doors.add(true);
            } else {
                doors.add(false);
            }
        }

    }

    // REQUIRES: int between [0, 2] inclusive
    // EFFECTS: returns a door number that is false
    public int chooseDoorFirst(int doorNumber) {
        if (doors.get(doorNumber)) {
            Random rand = new Random();
            int aFalseDoor = rand.nextInt(2);

            return aFalseDoor;

        } else if (doors.get((doorNumber + 1) % 3)) {
            return (doorNumber + 2) % 3;
        } else {
            return (doorNumber + 1) % 3;
        }
    }

    // REQUIRES: int between [0, 2] inclusive
    // EFFECTS: returns what is behind the door
    public boolean chooseDoor(int doorNumber) {
        return doors.get(doorNumber);
    }


}
