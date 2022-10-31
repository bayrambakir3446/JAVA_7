package gunler.gun9;

public class Ornekler {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean aEsitmidirbye = a == b;// a b ye esitmidir degildir sonuc false
        System.out.println("aEsitmidirbye = " + aEsitmidirbye);
        boolean aEsitDegildirbye = a != b;// a esit degildir b ye ---> evet  esit degildir sonuc true
        System.out.println(aEsitDegildirbye);
        System.out.println("a>b = " + (a > b));//false
        a = 10;
        b = 10;
        System.out.println(a >= b);// a b ye esit veya buyukmudur eve t buyuktur --> true
        System.out.println(a < b);
        System.out.println("a<=b = " + (a <= b));

    }
}
