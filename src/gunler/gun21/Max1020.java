package gunler.gun21;

public class Max1020 {
    public static void main(String[] args) {
//        Given 2 positive int values, return the larger value that is in the range 10..20
//    inclusive, or return 0 if neither is in that range.
//
//                max1020(11, 19) → 19
//        max1020(19, 11) → 19
//        max1020(11, 9) → 11
        // iki sayida 10 20 arasinda ise
        // iki sayi da 10 20 disinda ise
        // a degiskeni 10 - 20 b 10-20 degil
        // b 10-20 olabilir a 10-20 arasinda olmayabilir
        int a = 5;
        int b = 19;
        int buyukSayi = 10;
        if ((a > 9 && a < 21) && (b > 9 && b < 21)) {//  a=15 b=19
            if (a > b) {
                buyukSayi = a;
            } else {
                buyukSayi = b;
            }
//        } else if ((a > 9 && a < 21) && (b < 10 || b > 21)) {// a=15  b=35
        } else if ((a > 9 && a < 21)) {// a=15  b=35
            buyukSayi = a;
//        } else if ((b > 9 && b < 21) && (a < 10 || a > 21)) {
        } else if ((b > 9 && b < 21)) {
            buyukSayi = b;
        } else {
            buyukSayi = 0;
        }

        System.out.println("buyukSayi = " + buyukSayi);


    }
}
