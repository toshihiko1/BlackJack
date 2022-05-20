package game;

public class Dealer extends Player{


    // 配列
    int[] FirstSC = new int[3];

    // 変数
    int count = 0;


    // コンストラクタ
    public Dealer(String name, String icon, CardDeck deck) {
        super(name, icon, deck);
    }

    // メソッド
    public void over16() {
        while(true) {
            if(score() > 16) {
                break;
            }
            addACard();
        }
    }

    public String half() {
        
    }

}
