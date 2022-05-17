package exec;

import maylib.Util;
import game.Card;
import game.CardDeck;

public class Test {
    public static void main(String[] args) {
        // Util.getString("あいうえお");

        // for (int i = 1; i <= 52; i++) {
        //     Card c = new Card(i);
        //     System.out.printf("物理番号=%2d",c.getNum());
        //     System.out.printf("札=%2d",c.cardNumver());
        //     System.out.printf("種類=%2d",c.suitNumver());
        //     System.out.println("");
        // }

        CardDeck deck = new CardDeck(52);
        Card card;
        int a = 0;

        while((card = deck.next()) != null) {
            System.out.println("メイン:card=" + card);

        }

        a=0;
    

        System.out.println("start");
        for(int i = 0; i < 52; i++) {
            System.out.println("メソッドindexof:ループi番目のカード=" + deck.indexOf(i));
            System.out.println(a++);
        }


    }
}
