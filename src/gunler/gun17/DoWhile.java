package gunler.gun17;

public class DoWhile {
    public static void main(String[] args) {
        //degisken olusturulcak baslangic degeri atanacak
        // condition=sart
        // degiskenin degerini degisterecegiz
        int a = 0;
        do {
            System.out.println("block icindeyiz 1");// block icindeyiz 1
            System.out.println("hello");// hello
            System.out.println("block icindeyiz 2");// block icindeyiz 2
            a++;// a=>1 a=>2 a=>3
        } while (a < 3);// 1<3-->true 2<3->true 3<3->false

        System.out.println("block disindayiz");



    }
}
