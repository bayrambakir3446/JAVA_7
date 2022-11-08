package gunler.gun13;

public class NestedOrnek {
    public static void main(String[] args) {
        int numara = 16;
        if (numara % 2 == 0) {
            System.out.println("numara 2 ye kalnsiz bolunebilir");
        } else if (numara % 3 == 0) {
            System.out.println("numara 3 e kalansiz bolunebilir");
        }

        // dista bir if olusturuyoruz 2 ye kalansiz bolunebilirmi kontrol ediyoruz
        // 2 ye kalansiz bolunebilir ise icinde baska bir if olusturuyoruz 3 e kalansiz bolunebilirmmi
        // kontrol ediyoruz numara 6 ya kalnsiz bolunebilir
        numara = 12;
        if (numara % 2 == 0) {
            if (numara % 3 == 0) {
                System.out.println(numara + " 6 ya kalansiz bolunebilir");
            }
            if (numara % 5 == 0) {
                System.out.println(numara + " 10 a kalansiz bolunebiilir ");
            } else {
                System.out.println(numara + " 10 a kalansiz bolunemez.");
            }
        }
        System.out.println("if ler bitti block disindayiz.");

    }
}
