package gunler.gun17;

public class WhileLoops {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
        int a = 0;
        while (a < 3) {// a=0 --> true  a=1-->true  a=2--->true

            System.out.println("Hello");// Hello
//                                          Hello
//                                          Hello
            a++;// a=1 a=2 a=3 degerini 1 artiriyor
        }
        // dongulerin ortak noktalari
        // 1- degerini degistirebilecegimiz bir degisken olacak genelde de int - bu degiskene bir baslangic degeri atamamiz gerek
        // 2- condition olacak(true-false) true ise block execute edilecek
        // 3- dongumuzun ne kadar calismasini istiyor isek ona gore bir limit bbelirtmemiz gerek ona gorede
//         degiskenin degerini degistirmemiz gerek -artiracagiz veya azaltacagiz

        System.out.println("a = " + a);
        a = 0;
        while (a < 3) {
            System.out.println(a);// 0 1 2
            ++a;
        }
        System.out.println("dongu bitti");
        System.out.println("a = " + a);
        a = 0;
        while (a < 3) {
            a++;
            System.out.print(a+ " ");// 1 1
            System.out.println(a);// 2 2
            //                       3 3
            //                       2
            //                       3
            //                       3
        }
        System.out.println("a = " + a);

    }
}
