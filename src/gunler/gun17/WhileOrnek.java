package gunler.gun17;

public class WhileOrnek {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            System.out.print(i + " ");
            i++;
        }
        i = 0;
        while (i < 50) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
        i = 0;
        int son = 50;
        while (i < son) {
            i += 5;
            System.out.println(i);
        }
        i = 50;
        son = 0;
        while (i > 0) {
            System.out.println("i = " + i);
            i-=2;
        }


    }
}
