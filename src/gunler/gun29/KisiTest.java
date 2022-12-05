package gunler.gun29;

public class KisiTest {
    public static void main(String[] args) {
        Kisi ali=new Kisi();
        ali.yasHesapla(1990);
        Kisi veli=new Kisi();
        veli.yasHesapla(1970);
        System.out.println("ali.kisiYas = " + ali.kisiYas);
        System.out.println("veli.kisiYas = " + veli.kisiYas);
    }
}
