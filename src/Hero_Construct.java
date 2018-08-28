//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Hero_Construct {
    public Hero_Construct() {
    }

    public static void main(String[] args) {
        Class Warrior = new Class("Warrior");
        Race Human = new Race("Hurr");
        Hero Guts = new Hero(Warrior, Human);
        System.out.print(Guts);
    }
}
