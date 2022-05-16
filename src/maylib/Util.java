package maylib;

public class Util {

    // private String moji;

    //メソッド
    //文字列をそのまま返す
    public static String getString(String moji) {
        System.out.println(moji);
        if(moji == null) {
            return null;
        } else {
            return moji;
        }
    }

    //String型の数値をint型にして返す
    public static int getInt(String moji) {
        int judge = 0;
        System.out.println(moji);

        if (moji == null) {
            return judge;
        }

        if(!moji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return judge;
        }

        return Integer.parseInt(moji);
    }

    //String型の数値をDouble型にして返す
    public static double getDouble(String moji) {
        int judge = 0;
        System.out.println(moji);

        if (moji == null) {
            return judge;
        }

        if (!moji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return judge;
        }

        return Double.parseDouble(moji);

    }

    //String型の文字列の先頭の文字をchar型に変換して返す
    public static char getChar(String moji) {
        int judge = 0;
        int i = 0;
        char firstMoji;

        System.out.println(moji);

        if (moji == null) {
            return (char) judge;
        }

        if (!moji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return (char) judge;
        }

        firstMoji = moji.charAt(i);
        return firstMoji;

    }
}

// 毎日３限、６限に進捗を報告　5/17進捗と予定の報告 5/19P12の最初の課題が終われば
