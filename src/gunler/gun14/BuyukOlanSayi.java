package gunler.gun14;

public class BuyukOlanSayi {
    public static void main(String[] args) {
        int a = 210, b = 2120, c = 30, d = 500;
        int enBuyukSayi = 0;
        if (a > b && a > c && a > d) {
            enBuyukSayi = a;
        } else if (b > c && b > d) {
            enBuyukSayi = b;
        } else if (c > d) {
            enBuyukSayi = c;
        } else {
            enBuyukSayi = d;
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);

        enBuyukSayi = a;
        if (b > enBuyukSayi) {
            enBuyukSayi = b;
        }
        if (c > enBuyukSayi) {
            enBuyukSayi = c;
        }
        if (d > enBuyukSayi) {
            enBuyukSayi = d;
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);


    }
}
