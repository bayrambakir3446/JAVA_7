package gunler.gun35;

public class Arrayler3 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{95, 10, 7, 15, 53, 22, 35, 4, 19, 1};
        int toplam = 0;
        int max = 0;
        int min = 95;
        for (int sayi : sayilar) {
            if (sayi > max) {// 95 0 10 95
                max = sayi;// 95
            }
        }
        System.out.println("max = " + max);

// en kucuk sayiyi yazdiralim
        min = sayilar[0];
        for (int sayi : sayilar) {
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("min = " + min);

        toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
