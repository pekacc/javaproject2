package Army;

public class Phalanx extends Soldier implements DefensiveSoldier {


    public Phalanx(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void defend() {
        System.out.println(super.name + " is defending! Deals " + super.damage + " damage.");
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.name + " is reporting. Unit type: Phalanx (DEFENSIVE)");
    }

    public void createPhalanxFormation () {
        System.out.println("Soldier " + super.name + " is creating phalanx formation. Received damage is reduced!");
    }
}
