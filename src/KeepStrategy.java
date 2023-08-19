import java.util.Random;

public class KeepStrategy extends Strategy {

    public KeepStrategy() {
        super();
        Random rand = new Random();
        int choose = rand.nextInt(3);
        doors.chooseDoorFirst(choose);
        win = doors.chooseDoor(choose);

    }
}
