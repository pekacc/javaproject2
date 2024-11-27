package Army;

public class Knight extends Soldier implements OffensiveSoldier, DefensiveSoldier{


    public Knight(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void defend() {
        System.out.println(super.name + " is defending! Deals " + super.damage + " damage.");
    }

    @Override
    public void attack() {
        System.out.println(super.name + " is attacking! Deals " + super.damage + " damage.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.name + " is reporting. Unit type: Knight (VERSATILE)");
    }
}
