import Army.*;

public class Main {
    public static void main(String[] args) {
        Army army1 = new Army();

        army1.addSoldier(new Maceman("Maceman 1", 4));
        army1.addSoldier(new Maceman("Maceman 2", 3));
        army1.addSoldier(new Maceman("Maceman 3", 3));
        army1.addSoldier(new Phalanx("Phalanx 1", 5));
        army1.addSoldier(new Phalanx("Phalanx 2", 4));
        army1.addSoldier(new Phalanx("Phalanx 3", 6));
        army1.addSoldier(new Phalanx("Jožo", 10));
        army1.addSoldier(new Knight("Knight 1", 9));
        army1.addSoldier(new Knight("Knight 2", 8));

        System.out.println("---REPORT---\n");
        army1.report();
        System.out.println("--------------------------------------\n\n");
        System.out.println("----ATTACK---\n");
        army1.attack();
        System.out.println("--------------------------------------\n\n");
        System.out.println("---DEFEND---\n");
        army1.defend();
        System.out.println("--------------------------------------\n\n");
        System.out.println("---PHALANX FORMATION---\n");
        army1.createPhalanxFormation();
    }
}