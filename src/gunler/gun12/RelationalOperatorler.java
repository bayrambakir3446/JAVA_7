package gunler.gun12;

public class RelationalOperatorler {

    public static void main(String[] args) {
        //  > < <= >= == !=    boolean deger uretir
        int a = 10;
        int b = 20;
        System.out.println(a > b);// 10 20
        boolean sonuc = a > b;
//        System.out.println("a>b = " + a > b);
//                         "a>b = 10" > b           string > b(10)
        System.out.println("sonuc = " + sonuc);
//                          "sonuc = false"
        int numara = 21;
//        boolean ciftSayi = numara % 2 == 0;
        boolean ciftSayi = numara % 2 != 1;
        System.out.println("ciftSayi = " + ciftSayi);
        if (ciftSayi == false) {
            System.out.println("numara tek sayidir");
        }
        numara = 0;
        boolean numaraPozitifSayimi = numara >= 0;
        System.out.println(numaraPozitifSayimi);
    }


}
