package friday.creational.builder;

public class ChairBuilder {
    private int legs;
    private String material;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Chair getProduct() {
        return new Chair(legs, material);
    }
}
