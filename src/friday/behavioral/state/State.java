package friday.behavioral.state;

public abstract class State {
    protected Bottle bottle;

    public State(Bottle bottle) {
        this.bottle = bottle;
    }
    public abstract String drink();
    public abstract String fill();
    public abstract String status();

}
