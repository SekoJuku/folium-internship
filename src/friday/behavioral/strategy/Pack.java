package friday.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private Strategy strategy;
    private List<Horse> list = new ArrayList<>();

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Horse> getAll() {
        return list;
    }

    public void execute(String name) {
        list.add(strategy.addHorse(name));
    }
}
