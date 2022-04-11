package friday.behavioral.strategy;

public class BiologicalStrategy implements Strategy {
    @Override
    public Horse addHorse(String name) {
        return new Horse(name);
    }
}
