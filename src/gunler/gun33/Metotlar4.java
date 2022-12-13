package gunler.gun33;

import java.util.Locale;

public class Metotlar4 {
    public static void main(String[] args) {
        String sehir = "ey edip adanada pide ye";
        sehir.length();// stringin karakter sayisini veriyor
        sehir.charAt(0);// indeks numarasina gore istedigimiz karakteri verir
        sehir.substring(2, 5);// verdigimiz indekse gore string icindeki kisma ulasmamisi saglar
        sehir.indexOf('d');//istedigimiz karakterin ilk indeks numarasini veri
        sehir.lastIndexOf('y');//aradigimiz karakter birden fazla mevcut ise istedigimiz karakterin son indeks nosunu verir
        sehir.indexOf("edip");//aradigimiz stringin baslangic indeks nosunu verir
        sehir.trim();// stringin baslangic ve son kismindaki bosluklari silmemizi saglar
        sehir.toLowerCase();// stringin tamamini kucuk harflerle dondurur
        sehir.toUpperCase();// stringin tamamini buyuk harfle dondurur
        sehir.replace("adanada", "Bursa");//verdigimiz stringin yerine parametredeki stringi degistirir
        sehir.startsWith("ey");
        sehir.endsWith("");
        sehir.equals("");
        sehir.equalsIgnoreCase("");
        sehir.concat("");
        sehir.contains("");
    }
}
