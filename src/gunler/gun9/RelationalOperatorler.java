package gunler.gun9;

public class RelationalOperatorler {
    public static void main(String[] args) {
        int a = 10;// = atama operatoru esitligin sagindaki degeri soldaki degiskene atiyor
        System.out.println("a==10 = " + 2 + 9);
//                            string  + int --------->>>>.concetanation
//                          "a==10 = 2" + 9
        //                     string      int
//        a==10 = 29

        System.out.println(a == 10);// a 10 a esitmi boolean bir deger dondurur, verir
        System.out.println(a == 50);

        int b = 20;
        System.out.println(b > a);// >  bdegiskenin degeri a degiskeninin degerinde buyumu
        boolean sonuc = b > a;
        System.out.println("sonuc = " + sonuc);
        boolean b1 = a == b;
        System.out.println("b1 = " + b1);
        b = 10;
        a = 5;
        System.out.println("a>b = " + (a > b));
        String s = "a>b = " + (a > b);
//                 "a>b = false"
        System.out.println(s);
        a = 10;
        b = 10;
        System.out.println(a >= b);// a b den buyuk veya esitmi
        System.out.println(a < b);
        boolean aKucukEsitb = a <= b;
        System.out.println("aKucukEsitb = " + aKucukEsitb);
        System.out.println(a != b);// a b ye esit degildir
        System.out.println(a != 20);// a 20 ye esit degildir  -----> evet a 20 ye esit degildir --> true


    }
}
