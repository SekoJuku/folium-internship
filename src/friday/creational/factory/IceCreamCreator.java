package friday.creational.factory;

import friday.creational.factory.models.ChocolateIceCream;
import friday.creational.factory.models.IceCream;
import friday.creational.factory.models.StrawberryIceCream;

public class IceCreamCreator {
    public IceCream createIceCream(String type) {
        if(type.equals("Strawberry"))
            return new StrawberryIceCream();
        if(type.equals("Chocolate"))
            return new ChocolateIceCream();
        return null;
    }
}
