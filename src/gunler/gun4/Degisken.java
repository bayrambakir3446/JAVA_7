package gunler.gun4;

public class Degisken {
    public static void main(String[] args) {
        int a = 30;//  bir a degiskeni olusturyorum ve bu degiskenin data tipi integer
        // yani  deger olarak sadece tam sayi tasiyabilir
        // identifier tanimlayici, adi  a
        // bu degisken sadece tam sayi degerleri alabilir
        System.out.println("a = " + a);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// integerin alabilecegi en yuksek deger
        a = 100000;   System.out.println(a);      a = 200;
        System.out.println("a = " + a);
        a = 300;
        System.out.println("a = " + a);
        a = -200;
        System.out.println("a = " + a);
        a = -2147483647;
        System.out.println("a = " + a);
        long l = 2147483647;
        System.out.println("l = " + l);
        short b1 = 130;
        System.out.println("b1 = " + b1);
    }
}
