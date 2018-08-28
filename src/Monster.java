//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Monster extends Doors {
    String name;
    int monsterLVL;
    int treasureFor;
    int looseLVL;
    int escapeStat;
    String specialCondition;

    public Monster(String Name, int mstrLVL, int trsureFr, int lseLVL, int scapStt, String spclCond) {
        this.name = Name;
        this.monsterLVL = mstrLVL;
        this.treasureFor = trsureFr;
        this.looseLVL = lseLVL;
        this.escapeStat = scapStt;
        this.specialCondition = spclCond;
    }

    public String toString() {
        return "This monster name's " + this.name + ", it's level is: " + this.monsterLVL + "\n\t *Treasure: " + this.treasureFor + "\n\t *In case of fail you will loose: " + this.looseLVL + " lvl(s)," + "\n\t *Escape?: " + this.escapeStat + "\n\t *Special Condition: " + this.specialCondition + ".";
    }
}
