package gunler.gun21;

public class Ornekler {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("hello");
            if (i == 4 || i == 6 || i == 8) {
                System.out.println(i + " continue calisacak.");
                continue;
            }
            System.out.println("block ici");
            System.out.println();
        }
     //hello
        //block ici
        //hello
        //block ici
        //hello
        //4 continue calisacak.
        //hello
        //block ici
        //hello
        // 6 continue calisacak.
        //hello
        //block ici
        //hello
        //8 continue calisacak.





    }
}
