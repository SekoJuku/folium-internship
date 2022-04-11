package friday.behavioral.state;

public class Bottle {
    private State state;

    public Bottle() {
        setState(new EmptyState(this));
    }

    public Bottle(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
