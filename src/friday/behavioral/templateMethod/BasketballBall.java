package friday.behavioral.templateMethod;

public class BasketballBall extends BallTemplate {

    public BasketballBall() {
        super(24,"Enhanced Rubber");
    }

    @Override
    public double getBouncinessValue() {
        return getRadius()*0.9;
    }

    @Override
    public String toString() {
        return "BasketballBall " + super.toString();
    }
}
