package friday.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JuiceConsumer {
    private List<Juice> juiceList = new ArrayList<>();

    public boolean addJuice(double volume,String taste, String provider) {
        return juiceList.add(new Juice(volume,JuiceTypeFactory.getJuiceType(taste,provider)));
    }

    public void consumeAll() {
        for (Juice i :
                juiceList) {
            System.out.println(i.drink());
        }
        clearAll();
    }

    private void clearAll() {
        juiceList.clear();
    }
}
