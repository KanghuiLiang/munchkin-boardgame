//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Monster_Test {
    public Monster_Test() {
    }

    public static void main(String[] args) {
        Monster[] Monster = new Monster[]{new Monster("Young Rat", 1, 1, 1, 0, (String)null), new Monster("Mr.Bones", 2, 1, 2, 0, (String)null), new Monster("Snails on Speed", 4, 1, 0, -2, (String)null), new Monster("Screaming Gekk", 6, 2, 0, 0, (String)null), new Monster("Potter_Plant", 1, 1, 0, 0, (String)null), new Monster("3875 Orks", 10, 3, 0, 0, (String)null), new Monster("Amazon", 8, 2, 0, 0, (String)null), new Monster("Big Foot", 12, 3, 0, 0, (String)null), new Monster("Bull Rog", 18, 5, 2, 0, (String)null), new Monster("Crabs", 1, 1, 0, 0, (String)null), new Monster("Drooling Slime", 1, 1, 0, 0, (String)null), new Monster("Face Sucker", 8, 2, 0, 0, (String)null), new Monster("Floating Monster", 10, 3, 3, -4, (String)null), new Monster("Flyting Frogs", 2, 1, 2, -1, (String)null), new Monster("Gazebo", 8, 2, 3, 0, (String)null), new Monster("Gelatinous Octahedron", 2, 1, 0, 1, (String)null), new Monster("Ghoul Fiends", 8, 2, 1, 0, (String)null), new Monster("Harpies", 4, 2, 2, 0, (String)null), new Monster("Hippogrief", 16, 4, 2, 0, (String)null), new Monster("Insurance Salesman", 14, 4, 0, 0, (String)null), new Monster("King Tut", 16, 4, 2, 0, (String)null), new Monster("Lame Goblin", 1, 1, 1, 1, (String)null), new Monster("Large Angry Chicken", 2, 1, 1, 0, (String)null), new Monster("Lawyers", 6, 2, 0, 0, (String)null), new Monster("Leperchaun", 4, 2, 0, 0, (String)null)};
        double random = 0.0D + Math.random() * (double)(Monster.length + 1 - 0);
        random = (double)((int)Math.floor(random));
        System.out.print("\t" + Monster[(int)random]);
    }
}
