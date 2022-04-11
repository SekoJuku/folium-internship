package friday.behavioral.templateMethod;

public class FootballBall extends BallTemplate{
    public FootballBall(int size) {
        super();
        switch (size) {
            case (3) -> super.setRadius(7.25);
            case (4) -> super.setRadius(8);
            case (5) -> super.setRadius(8.5);
            default -> super.setRadius(9);
        }
        super.setMaterial("Rubber");
    }

    @Override
    public double getBouncinessValue() {
        return getRadius()*0.8;
    }

    @Override
    public String toString() {
        return "FootballBall " + super.toString();
    }
}
