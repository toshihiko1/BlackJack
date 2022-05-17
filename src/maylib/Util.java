package maylib;
import java.util.Scanner;

public class Util {

    // private String moji;

    //メソッド
    //文字列をそのまま返す
    public static String getString(String moji) {
        System.out.println(moji);
        Scanner scn = new Scanner(System.in);
        String scnMoji = scn.next();
        if(scnMoji == null) {
            return null;
        } else {
            return scnMoji;
        }
    }

    //String型の数値をint型にして返す
    public static int getInt(String moji) {
        int judge = 0;
        System.out.println(moji);
        Scanner scn = new Scanner(System.in);
        String scnMoji = scn.next();

        if (scnMoji == null) {
            return judge;
        }

        if(!scnMoji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return judge;
        }

        return Integer.parseInt(scnMoji);
    }

    //String型の数値をDouble型にして返す
    public static double getDouble(String moji) {
        int judge = 0;
        System.out.println(moji);
        Scanner scn = new Scanner(System.in);
        String scnMoji = scn.next();

        if (scnMoji == null) {
            return judge;
        }

        if (!scnMoji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return judge;
        }

        return Double.parseDouble(scnMoji);

    }

    //String型の文字列の先頭の文字をchar型に変換して返す
    public static char getChar(String moji) {
        int judge = 0;
        int i = 0;
        char firstMoji;

        System.out.println(moji);
        Scanner scn = new Scanner(System.in);
        String scnMoji = scn.next();

        if (scnMoji == null) {
            return (char) judge;
        }

        if (!scnMoji.matches("[+-]?\\d*(\\.\\d+)?")) {
            return (char) judge;
        }

        firstMoji = scnMoji.charAt(i);
        return firstMoji;

    }
}

// 毎日３限、６限に進捗を報告　5/17進捗と予定の報告 5/19P12の最初の課題が終われば
