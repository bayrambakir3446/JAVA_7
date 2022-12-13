package gunler.gun34;

import java.util.Scanner;

public class Aylar {

    public static void main(String[] args) {

        // Yilin aylarini gosteren bir array olusturun
        // Kullanicidan aldiginiz dogdugu ayi dogru bir sekilde bastirin

        Scanner sc = new Scanner(System.in);

        String [] aylar = new String[12];

        aylar[0] = "Ocak";
        aylar[1] = "Subat";
        aylar[2] = "Mart";
        aylar[3] = "Nisan";
        aylar[4] = "Mayis";
        aylar[5] = "Haziran";
        aylar[6] = "Temmuz";
        aylar[7] = "Agustos";
        aylar[8] = "Eylul";
        aylar[9] = "Ekim";
        aylar[10] = "Kasim";
        aylar[11] = "Aralik";

        System.out.println("Lutfen dogdugunuz ayi sayi olarak giriniz!");
        int ay = sc.nextInt();

        System.out.println("Kullanicinin dogdugu ay " + aylar[ay - 1]);
    }
}
