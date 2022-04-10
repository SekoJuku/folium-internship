package friday.structural.facade.innards;

public class Bread {
    private String type;

    public Bread(String type) {
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
        return "Bread{" +
                "type='" + type + '\'' +
                '}';
    }
}
