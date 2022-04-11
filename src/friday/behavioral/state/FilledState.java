package friday.behavioral.state;

public class FilledState extends State{

    public FilledState(Bottle bottle) {
        super(bottle);
    }

    @Override
    public String drink() {
        bottle.setState(new EmptyState(bottle));
        return "Drinking";
    }

    @Override
    public String fill() {
        return "Already filled";
    }

    @Override
    public String status() {
        return "Filled";
    }


}
