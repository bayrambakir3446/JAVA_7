package gunler.gun18;

public class Faktoriyel {

    public static void main(String[] args) {

        // Bir sayinin faktoriyel degerini bulan bir program yaziniz

        int faktoriyel = 1;
        int sayi = 5;

        for(int i = sayi; i >= 1; i--){
            faktoriyel *= i;
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
