package friday.structural.flyweight;

public class Juice {
    private double volume;
    private JuiceType juiceType;

    public Juice() {

    }

    public Juice(double volume, JuiceType juiceType) {
        this();
        this.volume = volume;
        this.juiceType = juiceType;
    }

    public String drink() {
        return "Drinking " + this.juiceType;
    }

    public void setJuiceType(JuiceType juiceType) {
        this.juiceType = juiceType;
    }

    public double getVolume() {
        return volume;
    }
}
