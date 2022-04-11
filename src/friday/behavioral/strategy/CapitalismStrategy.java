package friday.behavioral.strategy;

public class CapitalismStrategy implements Strategy {
    @Override
    public Horse addHorse(String name) {
        return new Horse(name);
    }
}
