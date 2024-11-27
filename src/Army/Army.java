package Army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<Soldier> soldiers;


    public Army() {
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier (Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public void report () {
        for (Soldier soldier:soldiers) soldier.report();
    }

    public void attack () {
        for (Soldier soldier:soldiers) {
            if (soldier instanceof OffensiveSoldier) ((OffensiveSoldier) soldier).attack();
        }
    }

    public void defend() {
        for (Soldier soldier:soldiers) {
            if (soldier instanceof DefensiveSoldier) ((DefensiveSoldier) soldier).defend();
        }
    }

    public void createPhalanxFormation () {
        for (Soldier soldier:soldiers) {
            if (soldier instanceof Phalanx) ((Phalanx) soldier).createPhalanxFormation();
        }
    }
}
