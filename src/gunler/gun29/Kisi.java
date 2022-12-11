package gunler.gun29;

import java.time.LocalDate;

public class Kisi {
    int kisiYas;


    public void yasHesapla(int dogumYili) {
        LocalDate localDate = LocalDate.now();
        int yas = localDate.getYear() - dogumYili;
        //          2022                  1970
        System.out.println("yas = " + yas);
        kisiYas = yas;
    }
}
