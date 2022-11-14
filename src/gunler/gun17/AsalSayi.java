package gunler.gun17;

public class AsalSayi {
    public static void main(String[] args) {

        // asal mi degilmi
        // 1 ve kendisinden baska bir sayiya kalansiz bolunmeyen sayi
        // kalani kontrol etmek icin

        int numara = 7;
        int i = 2;
        int sayac = 0;
        while (i < numara) {
            if (numara % i == 0) {
                System.out.println(numara + " bu sayiya bolunebiliyor :" + i);
                sayac++;
            }
            i++;
        }
        if (sayac == 0) {
            System.out.println("bu sayi asal bir sayidir.");
        } else {
            System.out.println("sayi asal degildir");
        }

    }
}
