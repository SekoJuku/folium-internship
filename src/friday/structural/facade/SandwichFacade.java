package friday.structural.facade;

import friday.structural.facade.innards.Bread;
import friday.structural.facade.innards.Meat;

public class SandwichFacade {
    public Sandwich getSandwich(String meatType, String breadType) {
        Sandwich sandwich = new Sandwich();
        sandwich.setMeat(new Meat(meatType));// here can be some Factory and complicated things
        sandwich.setBread(new Bread(breadType));// same here
        return sandwich;
    }
}
