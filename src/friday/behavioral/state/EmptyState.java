package friday.behavioral.state;

public class EmptyState extends State{
    public EmptyState(Bottle bottle) {
        super(bottle);
    }

    @Override
    public String drink() {
        return "Nothing to drink";
    }

    @Override
    public String fill() {
        bottle.setState(new FilledState(bottle));
        return "Filling";
    }

    @Override
    public String status() {
        return "Empty";
    }
}
