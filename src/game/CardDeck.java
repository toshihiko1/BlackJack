package game;

public class CardDeck {
    //定数
    int CARDNUM = 52;
    int count;

    // 臨時
    int a = 0;


    // プロパティ
    private int max;
    private Card[] deck;

    // コンストラクタ
    public CardDeck(int max) {
        this.max = max;
        deck = new Card[max];
        initialize();
    }

    // メソッド
    //deck[]を初期化
    public void initialize() {
        System.out.println("---------initialize----------");
        for(int i = 0; i < CARDNUM; i++) {
            this.deck[i] = null;
            System.out.println("配列deck" + i + this.deck[i]);
        }

        for (int i = 1; i < 52; i++) {
            Card c = new Card(i);
            c.getNum();
            c.cardNumver();
            c.suitNumver();
            this.deck[i] = c;
        }

    }

    // k番目のカードを取り出す
    public Card indexOf(int k) {
        return this.deck[k];
    }

    //
    public int size() {
        return CARDNUM - count;
    }

    public Card next() {
        Card stock;
        int count = 0;

        for (int i = 0; i < CARDNUM; i++) {
            if (this.deck[i] == null) {
                count++;
                System.out.println("------------------メイン:count=" + count);
            }
        }

        if(count == CARDNUM) {
            System.out.println("count = CARDNUM:終了");
            return null;
        }

        while(true) {
            int p = (int) (Math.random() * this.max);
            System.out.println("メソッドnext:ランダム=" + p);
            if(this.deck[p] != null) {
                stock = this.deck[p];
                this.deck[p] = null;
                System.out.println("メソッドnext:ランダム番目の要素にnullを入れたので=" + this.deck[p]);
                return stock;
            }
        }

    }






}
