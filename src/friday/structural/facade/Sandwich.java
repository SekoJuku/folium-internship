package friday.structural.facade;

import friday.structural.facade.innards.Bread;
import friday.structural.facade.innards.Meat;

public class Sandwich {
    private Meat meat;
    private Bread bread;

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "meat=" + meat +
                ", bread=" + bread +
                '}';
    }
}
