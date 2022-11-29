package gunler.gun25;

public class Recursion {
    public static void main(String[] args) {

        numara(5);
    }

    public static void numara(int a) {
        if (a > 0) {
            numara(a - 1);
        }

        System.out.println(a);
    }
}
