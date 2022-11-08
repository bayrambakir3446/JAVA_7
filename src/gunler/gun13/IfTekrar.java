package gunler.gun13;

public class IfTekrar {
    public static void main(String[] args) {
        int numara = 30;
        boolean sonuc = numara > 0;
        if (sonuc) {
            System.out.println("numara 0 dan buyuktur.");
            numara += 5; // numara = numara + 5
        }
        System.out.println("numara = " + numara);
        int numara2 = 30;
        if (numara == 20) {
            // block icinde bir degisken olustursak bu degiskeni sadce bu block icinde kullanabiliriz.
            System.out.println("numara pozitif bir sayidir.");
            System.out.println("numara2 = " + numara2);
            numara2 += 10;
            System.out.println("numara2 = " + numara2);
        }
        System.out.println("numara2 = " + numara2);
        if (numara > 0) {
            System.out.println("sayi poztif");
        } else {
            System.out.println("sayi pozitif degildir.");
        }

    }
}
