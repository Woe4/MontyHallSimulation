public class Main {

    public static void main(String[] args) {

        int attempts = 0;
        int wins = 0;

        for (int i = 0; i<1000; i++) {
            Strategy attempt;
            attempt = new KeepStrategy();
            if (attempt.getWin()) {
                wins++;
            }
            attempts++;
        }

        float winrate = ((float) wins) / ( (float) attempts);

        System.out.println("Strategy: Keep");
        System.out.println("Total wins: " + wins);
        System.out.println("Total attempts: " + attempts);
        System.out.println("Win rate: " + winrate);

        attempts = 0;
        wins = 0;

        for (int i = 0; i<1000; i++) {
            Strategy attempt;
            attempt = new SwitchStrategy();
            if (attempt.getWin()) {
                wins++;
            }
            attempts++;
        }

        winrate = ((float) wins) / ( (float) attempts);

        System.out.println("Strategy: Switch");
        System.out.println("Total wins: " + wins);
        System.out.println("Total attempts: " + attempts);
        System.out.println("Win rate: " + winrate);

    }
}
