package gunler.gun41_Constructors1;

import java.util.ArrayList;

public class Banka {
    String adi;
    String adresi;
    int hesapNo = 1000;
    ArrayList<Musteri> musteriler = new ArrayList<>();

    public Banka(String adi, String adresi) {
        this.adi = adi;
        this.adresi = adresi;
    }
}
