package Army;

public abstract class Soldier {
    protected final String name;
    protected int damage;   //damage can change over time, therefore is not final

    public Soldier(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    abstract public void report();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}