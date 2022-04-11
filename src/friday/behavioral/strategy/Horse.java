package friday.behavioral.strategy;

public class Horse {
    private final String name;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
