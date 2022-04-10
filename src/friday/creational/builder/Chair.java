package friday.creational.builder;

public class Chair {
    private int legs;
    private String material;

    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +
                ", material='" + material + '\'' +
                '}';
    }

}
