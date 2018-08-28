//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Game_Start {
    public Game_Start() {
    }

    private static int Randomizer(int x, int y) {
        double random = (double)x + Math.random() * (double)(y + 1 - x);
        random = Math.floor(random);
        return (int)random;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Treasure[] startingHand = new Treasure[8];
        Treasure[] playerHand = new Treasure[5];

        int y;
        for(y = 0; y < 8; ++y) {
            startingHand[y] = Card_Constructor.TreasureCards[Randomizer(0, 23)];
            System.out.print("\n-=" + y + "=- " + startingHand[y]);
        }

        System.out.print("\n\nPick five cards: \n");

        for(y = 0; y < 5; ++y) {
            int number = console.nextInt();
            playerHand[y] = startingHand[number];
        }

        for(y = 0; y < 5; ++y) {
            System.out.print(playerHand[y]);
        }

        for(y = 0; y < playerHand.length; ++y) {
            ;
        }

    }
}
