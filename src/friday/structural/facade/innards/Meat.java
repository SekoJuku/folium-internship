package friday.structural.facade.innards;

public class Meat {
    private String type;

    public Meat(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "type='" + type + '\'' +
                '}';
    }
}
