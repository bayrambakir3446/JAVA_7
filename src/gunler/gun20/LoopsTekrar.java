package gunler.gun20;

public class LoopsTekrar {
    public static void main(String[] args) {
        // for while do-while foreach

        // degisken --->byte short char int long double float  baslangic degeri atayavagiz
        // condition-sart
        // degiskenin degerini degisterecegiz
        // block

//        for (int i = 0; i < 3; ++i) {// 1  2 3
//            //    1       2      3
//
//            System.out.println("*");//4 block     0 1 2
//
//        }
//        // 1  2  4  3  2  4 3 2 4 3 2
//        System.out.println("block disi");


//        for (int i = 0; i < 10; ++i) {
//            //    1       2      3
//
//            System.out.print(i + " " + "*");// 0 *hello
//            System.out.println("hello");    // 1 *hello
//            //                                 2 *hello
//
//        }


        for (int i = 0; i <= 10; ++i) {
            //    1       2      3

            System.out.print(i + " " + "*");// 0 *hello
            System.out.println("hello");    // 2 *hello
            //  4 *hello
            ++i;//1 3
        }

        for (int n = 10; n > 0; n--) {// 10 9 8 7 6 5 4 3 2 1
            System.out.print("decrement ");// decrement10
            System.out.println(n);        // decrement9
        }




        System.out.println("block disi");


    }
}
