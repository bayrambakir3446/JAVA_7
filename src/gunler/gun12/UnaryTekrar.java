package gunler.gun12;

public class UnaryTekrar {
    public static void main(String[] args) {
        // increment decrement  artis - ve azalma
        int a = 10;
        // increment degiskenin degerini  1 artirir
        ++a;// degiskenin adindan once kullanilirsa preincrement
        System.out.println(a);
        a++;
        System.out.println(a);
        a = -12;
        System.out.println(a);
        a = 12;
        --a;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
        a = 10;
        System.out.println(a++ + a++ + a++);
        //                 10    11    12
        System.out.println("a = " + a);
        a = 10;
        // precedence    top priority unary
        System.out.println(a++ + ++a * 2);// unary operatorlerin diger operatorler uzerinde bir onceligi
        //                 10  + 12  * 2
        a = 10;
        int b = a++;
        int c = a;
        System.out.println("a = " + a);// 11
        System.out.println("b = " + b);// 10
        System.out.println("c = " + c);// 11


        int not = 100;
        int sinif = 5;
        if (not > 75) {
//            sinif++;
            //   sinif = sinif + 1;
            sinif += 1;
        } else {
            //sinif--;
//            sinif = sinif - 1;
            sinif -= 1;
        }
        System.out.println("sinif = " + sinif);



    }
}
