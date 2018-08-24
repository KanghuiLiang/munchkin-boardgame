public class Main {

    public static void main(String[] args) {
        Weapon wp = new Weapon("WP", 10, 100, 2);
        Character c = new Character("ca", 100, 100, 10, 100, 2, wp);
        System.out.println(c);
    }
}
