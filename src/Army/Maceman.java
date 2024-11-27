package Army;

public class Maceman extends Soldier implements OffensiveSoldier {

    public Maceman(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(super.name + " is attacking! Deals " + super.damage + " damage.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.name + " is reporting. Unit type: Maceman (OFFENSIVE)");
    }
}
