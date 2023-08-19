public abstract class Strategy {
    protected Doors doors;
    protected boolean win;

    public Strategy() {
        doors = new Doors();
    }

    public boolean getWin() {
        return win;
    }
}
