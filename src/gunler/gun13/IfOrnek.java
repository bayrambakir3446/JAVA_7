package gunler.gun13;

public class IfOrnek {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        // buyuk olan sayiyi yazdiralim
        int buyukSayi;
        if (a > b) {
            System.out.println("buyuk sayi a " + a);
            buyukSayi = a;
        } else if (b > a) {
            System.out.println("bujyuk sayi b " + b);
            buyukSayi = b;
        } else {
            buyukSayi = 0;
            System.out.println("sayilar esit");
        }
        System.out.println("buyukSayi = " + buyukSayi);


    }
}
