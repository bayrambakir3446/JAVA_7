package gunler.gun44_StaticMembers1;

public class Ogrenci {
    static int okulNo = 1000;
    String adi;
    int ogrNo;

    final static String okulAdi = "EuroTech Study";//Sabit hale getirdik.
    final static String okulAdresi = "Germany";

    public Ogrenci(String adi) {
        okulNo++;
        this.ogrNo = okulNo;
        this.adi = adi;
       /* this.okulAdi = okulAdi;
        this.okulAdresi = okulAdresi;*/
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "Öğrenci No=" + ogrNo +
                ", adi='" + adi + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
