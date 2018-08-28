//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Race {
    String race;
    String raceBonus;

    public Race(String Race) {
        if (Race.equals("Halfling")) {
            this.race = Race;
            this.raceBonus = "Sell items at NPC for double the price, if failed to escape, may throw one card to try again";
        } else if (Race.equals("Dwarf")) {
            this.race = Race;
            this.raceBonus = "You can hold six cards in hand";
        } else if (Race.equals("Elf")) {
            this.race = Race;
            this.raceBonus = "+1 to escape, get additional level if beat two monsters in a row";
        } else {
            this.race = "Human";
            this.raceBonus = "";
        }

    }

    public String toString() {
        return this.race + "\nYour race bonus is:" + this.raceBonus;
    }
}
