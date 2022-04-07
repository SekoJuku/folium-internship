package thursday.ocp;

public class Weapon { //
    private final Long damage;

    public Weapon(Long damage) {
        this.damage = damage;
    }

    public Long getDamage() {
        return damage;
    }

    public Long calculateDamage() {
        return this.getDamage();
    }
}
