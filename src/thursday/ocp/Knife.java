package thursday.ocp;

public class Knife extends Weapon {
    public Knife(Long damage) {
        super(damage);
    }

    @Override
    public Long calculateDamage() {
        return this.getDamage();
    }
}
