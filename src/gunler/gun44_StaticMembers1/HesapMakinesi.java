package gunler.gun44_StaticMembers1;

import gunler.gun42_Constructors2.Student.Kurs;

public class HesapMakinesi {
    public static double sonuc;

    public static void topla(int sayiA, int sayiB){
        sonuc = sayiA + sayiB;
        System.out.println("sonuc = " + sonuc);
        sonuc = 0;
    }
    public static void topla(int... sayi){//Var args
        System.out.println(sayi.length);
        for (int i = 0; i < sayi.length; i++) {
            System.out.println("sayi[i] = " + sayi[i]);
            sonuc += sayi[i];
        }
        System.out.println("sonuc = " + sonuc);
        sonuc=0;
    }
    public static void ogrenciEkle(Ogrenci... ogrenciler){//Var args
        for (Ogrenci eleman:ogrenciler){
            System.out.println("eleman = " + eleman);
        }
    }

}
