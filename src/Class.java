//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Class {
    String Class;
    String classBonus;

    public Class(String Class) {
        if (Class.equals("Warrior")) {
            this.Class = Class;
            this.classBonus = "May throw up to 3 cards in combar to get +1 bonus for each. If your levels are even, you win";
        } else if (Class.equals("Thief")) {
            this.Class = Class;
            this.classBonus = "nMay throw 1 card to -2 debuff a monster, may try to steal additional item from monster, roll a dice, if more than 4, it's success.";
        } else if (Class.equals("Wizard")) {
            this.Class = Class;
            this.classBonus = "May throw 3 cards to -1 chanse for escape, may throw whole hand to not to fight with monster, doesn't get a level, but gets treasure.";
        } else if (Class.equals("Cliric")) {
            this.Class = Class;
            this.classBonus = "You may throw cards to get bonus buff +3 for each when in combat with monster over 15lvl.";
        }

    }

    public String toString() {
        return this.Class + " \nYour class bonus is: " + this.classBonus;
    }
}
