//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Randomizer {
    public Randomizer() {
    }

    public static int Randomizer(int x, int y) {
        double random = (double)x + Math.random() * (double)(y + 1 - x);
        random = Math.floor(random);
        return (int)random;
    }
}
