//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Treasure extends Card_Constructor {
    String name;
    int bonus;
    int price;
    String raceRestrict;
    String classRestriction;
    String typeOfTreasure;
    String specialCondition;

    public Treasure(String Name, int bns, int prce, String raceRest, String clssRest, String tpOfTres, String spclCond) {
        this.name = Name;
        this.bonus = bns;
        this.price = prce;
        this.raceRestrict = raceRest;
        this.classRestriction = clssRest;
        this.typeOfTreasure = tpOfTres;
        this.specialCondition = spclCond;
    }

    public String toString() {
        return "\n[Treasure] " + this.name + "\nB: " + this.bonus + " $: " + this.price + "\nRace Restrict: " + this.raceRestrict + " Clss Restrict:  " + this.classRestriction + "\nType: " + this.typeOfTreasure + " Special Condition: " + this.specialCondition;
    }
}
