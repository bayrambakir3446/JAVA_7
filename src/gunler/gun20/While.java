package gunler.gun20;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println("hello");
            i++;// 1 2 3 4 5 6 7 8 9 10
        } while (i < 10);
        System.out.println("i = " + i);

        for (i = 0; i < 10; i++) {
            System.out.println("for");
        }

        // 123456      654321




    }
}
