package thursday.ocp;

public class Mace extends Weapon {
    public Mace(Long damage) {
        super(damage);
    }

    @Override
    public Long calculateDamage() {
        return this.getDamage() * 2;
    }
}
