package gunler.gun14;

public class PosNeg {
//    Given 2 int values, return true if one is negative and one is positive.
//        Except if the parameter "negative" is true, then return true only if both are negative.
//        posNeg(1, -1, false) → true
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true

    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        boolean c = false;// true ise  her iki int degisken de negatif ise true yazdiriyoruz
        // int degiskenlerden bir tanesi negatif bir tanesi pozitif ise true yazdiralim
        boolean sonuc = false;
        if (c) {
            if (a < 0 && b < 0) {
                System.out.println(true);
                sonuc = true;
            }
        } else { // c degiskeni false ise
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                System.out.println(true);
                sonuc = true;
            }
        }
        System.out.println("sonuc = " + sonuc);


    }
}
