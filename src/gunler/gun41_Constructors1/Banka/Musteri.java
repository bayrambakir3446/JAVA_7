package gunler.gun41_Constructors1.Banka;

public class Musteri {
    //Data members---veri saklayan değişkenler
    String adi;
    int hesapNo;
    int kimlikNo;
    int telefonNo;
    double bakiye;

    public Musteri() {

    }

    public Musteri(String adi, int kimlikNo) {
        this.adi = adi;
        this.kimlikNo = kimlikNo;
    }

    public Musteri(String adi, int hesapNo, int kimlikNo, int telefonNo, double bakiye) {
        this.adi = adi;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }

    public void showInfo(){
        System.out.println("**** Müşteri Bilgileri ****");
        System.out.println("----------------------------");
        System.out.println("Müşterinin adı           : " + this.adi);
        System.out.println("Müşterinin kimlik no     : " + this.kimlikNo) ;
        System.out.println("Müşterinin hesp no       : "  + this.hesapNo);
        System.out.println("Müşterinin telefon no    : " + this.telefonNo);
        System.out.println("Müşterinin hesap bakiyesi: " + this.bakiye);
    }
}
