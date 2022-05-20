package game;

public class Player {
    //定数
    int CARDNUM = 52;

    //配列
    int[] FirstSC = new int[52];

    // 変数
    int count = 0;


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
        // int count = 0;
        System.out.println("---------initialize----------");
        for (int i = 0; i < CARDNUM; i++) {
            this.hand[i] = null;
            System.out.println("配列hand" + i + this.hand[i]);
        }

        while (true) {
            int p = (int) (Math.random() * CARDNUM);
            System.out.println("メソッドinitialize:ランダム手札に追加=" + p);
            if (this.deck.deck[p] != null) {
                FirstSC[count] = p;
                stock = this.deck.deck[p];
                this.deck.deck[p] = null;
                hand[p] = stock;
                System.out.println("hand=" + hand[p].getNum());
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
        // int count = 0;

        System.out.println("---------addACard----------");
        // for (int i = 0; i < CARDNUM; i++) {
        //     this.hand[i] = null;
        //     System.out.println("配列deck" + i + this.hand[i]);
        // }

        while (true) {
            int p = (int) (Math.random() * CARDNUM);
            System.out.println("メソッドaddACard:ランダム=" + p);
            if (this.deck.deck[p] != null) {
                FirstSC[count] = p;
                System.out.println("count=" + count);
                stock = this.deck.deck[p];
                this.deck.deck[p] = null;
                hand[p] = stock;
                count++;
                System.out.println("メソッドaddACard:ランダム番目の要素にnullを入れたので=" + this.deck.deck[p]);
                break;
            }
        }
    }

    public String check() {
        String cardMark1;
        String cardMark2;
        String cardThirtNum1;
        String cardThirtNum2;
        String checkCard1;
        String checkCard2;


        cardMark1 = String.valueOf(hand[FirstSC[0]].suitNumver());
        cardThirtNum1 = String.valueOf(hand[FirstSC[0]].cardNumver());

        cardMark2 = String.valueOf(hand[FirstSC[1]].suitNumver());
        cardThirtNum2 = String.valueOf(hand[FirstSC[1]].cardNumver());


        checkCard1 = this.icon + this.name + cardMark1 + cardThirtNum1;
        checkCard2 = cardMark2 + cardThirtNum2;

        return checkCard1 + checkCard2;

    }

    public int score() {
        int handSum = 0;
        int handCheck = 0;

        for(int i = 0; ;i++) {

            handCheck = FirstSC[i];
            if(handCheck == 0) {
                break;
            }
            
            handSum = handSum + handCheck;
            handCheck = 0;
        }

        return handSum;
    }

}
