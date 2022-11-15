package gunler.gun18;

public class BolenSayisi {

    public static void main(String[] args) {

        // 1 den 100 kadar olan sayilardan 7 ye bir kalanli bolunen sayislarin kac adet oldugunu bulunuz

        int sayac = 0;
        for(int i=7; i<=100; i ++){
            if(i%7==1){
                System.out.println("i = " + i);
                System.out.println(++sayac);
            }
        }
        System.out.println("sayac = " + sayac);
    }
}
