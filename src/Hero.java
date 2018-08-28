//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Hero {
    int lvl = 1;
    int bonus = 0;
    Class Class;
    Race Race;
    String[] handItems = new String[5];
    String[] offHandItems = new String[20];

    public Hero() {
        this.Class = null;
        this.Race = null;
        this.handItems[0] = "";
        this.offHandItems[0] = "";
    }

    public Hero(Class HeroClass) {
        this.Class = HeroClass;
        this.Race = null;
        this.handItems[0] = "";
        this.offHandItems[0] = "";
    }

    public Hero(Race HeroRace) {
        this.Class = null;
        this.Race = HeroRace;
        this.handItems[0] = "";
        this.offHandItems[0] = "";
    }

    public Hero(Class HeroClass, Race HeroRace) {
        this.Class = HeroClass;
        this.Race = HeroRace;
        this.handItems[0] = "";
        this.offHandItems[0] = "";
    }

    public String toString() {
        return "Your level is: " + this.lvl + "\nYour bonus is: " + this.bonus + "\nYour class is: " + this.Class + "\nYour race is: " + this.Race + "\n# of Items in your hand: " + this.handItems + "\n# of Items off hands: " + this.offHandItems;
    }
}
