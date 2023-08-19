import java.util.Random;

public class SwitchStrategy extends Strategy {

    public SwitchStrategy() {
        super();
        Random rand = new Random();
        int choose = rand.nextInt(3);
        int notDoor = doors.chooseDoorFirst(choose);
        int sum = choose + notDoor;
        if (sum == 1) {
            win = doors.chooseDoor(2);
        } else if (sum == 2) {
            win = doors.chooseDoor(1);
        } else {
            win = doors.chooseDoor(0);
        }

    }
}
