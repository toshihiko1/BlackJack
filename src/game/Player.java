package game;

public class Player {
    //定数
    int CARDNUM = 52;

    //配列
    int[] FirstSC = new int[2];


    // プロパティ
    private CardDeck deck;
    private Card[] hand;
    private String name;
    private String icon;

    // コンストラクタ
    public Player(String name, String icon, CardDeck deck) {
        this.name = name;
        this.icon = icon;
        this.deck = deck;
        this.hand = new Card[CARDNUM];
        initialize();
    }

    // メソッド
    public void initialize() {
        Card stock;
        int count = 0;
        System.out.println("---------initialize----------");
        for (int i = 0; i < CARDNUM; i++) {
            this.hand[i] = null;
            System.out.println("配列deck" + i + this.hand[i]);
        }

        while (true) {
            int p = (int) (Math.random() * CARDNUM);
            System.out.println("メソッドinitialize:ランダム=" + p);
            if (this.deck.deck[p] != null) {
                stock = this.deck.deck[p];
                this.deck.deck[p] = null;
                hand[p] = stock;
                count++;
                System.out.println("メソッドinitialize:ランダム番目の要素にnullを入れたので=" + this.deck.deck[p]);
                if(count == 2) {
                    break;
                }
            }
        }
    }

    public void addACard() {
        Card stock;
        int count = 0;

        System.out.println("---------addACard----------");
        for (int i = 0; i < CARDNUM; i++) {
            this.hand[i] = null;
            System.out.println("配列deck" + i + this.hand[i]);
        }

        while (true) {
            int p = (int) (Math.random() * CARDNUM);
            System.out.println("メソッドaddACard:ランダム=" + p);
            if (this.deck.deck[p] != null) {
                FirstSC[count] = p;
                stock = this.deck.deck[p];
                this.deck.deck[p] = null;
                hand[p] = stock;
                count++;
                System.out.println("メソッドaddACard:ランダム番目の要素にnullを入れたので=" + this.deck.deck[p]);
                if(count == 2) {
                    break;
                }
            }
        }
    }

    public String check() {
        String cardMark = String.valueOf(hand[FirstSC[0]].suitNumver());
        String cardThirtNum = String.valueOf(hand[FirstSC[0]].cardNumver());
        String checkCard = icon + name;

        return icon;

    }

}
