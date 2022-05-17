package game;

public class Card {
    public static final Card deck = null;

    //定数
    int RANK = 13;

    // プロパティ
    private int n;

    // コンストラクタ
    /**
     * コンストラクタ
     * @param n 1〜52の物理番号
     */
    public Card(int n) {
        this.n = n;
    }

    //メソッド
    public int getNum() {
        return n;
    }

    public int cardNumver() {
        int cn;
        cn = n % RANK;
        if(cn == 0) {
            return RANK;
        } else {
            return cn;
        }
    }

    public int suitNumver() {
        int sn;
        sn = (n - 1) / RANK;
        return sn;
    }
}
