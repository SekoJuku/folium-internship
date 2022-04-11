package friday.behavioral.templateMethod;

public abstract class BallTemplate {
    private double radius;
    private String material;

    public BallTemplate() {
    }

    public BallTemplate(double radius, String material) {
        this();
        this.radius = radius;
        this.material = material;
    }

    public abstract double getBouncinessValue();

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "BallTemplate{" +
                "radius=" + radius +
                ", material='" + material + '\'' +
                '}';
    }
}
