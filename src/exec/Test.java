package exec;

import maylib.Util;
import game.Card;

public class Test {
    public static void main(String[] args) {
        Util.getString("あいうえお");

        for (int i = 1; i <= 52; i++) {
            Card c = new Card(i);
            System.out.printf("物理番号=%2d",c.getNum());
            System.out.printf("札=%2d",c.cardNumver());
            System.out.printf("種類=%2d",c.suitNumver());
            System.out.println("");
        }


    }
}
