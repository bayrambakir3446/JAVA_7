package gunler.gun17;

public class DoWhile2 {
    public static void main(String[] args) {

        int i = 5;

        do {

            System.out.println("hello");// hello hello
            System.out.println("i = " + i);// 5 4 3 2 1

            i--;// 4 3 2 1 0
        } while (i > 0);// 4>0 ->true 3>0-->true 2>0--> true 1>0--->true 0>0---> false

        System.out.println("i = " + i);

        i = 0;
        do {

            System.out.println("do block calisti");

        } while (i > 5);

        i = 0;
        while (i > 5) {
            System.out.println("while block calisti");
        }


    }
}
