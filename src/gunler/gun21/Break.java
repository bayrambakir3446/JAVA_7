package gunler.gun21;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("hello");//0 1 2
        }
        System.out.println("block disindayiz");

        for (int n = 0; n < 10; n++) {
            System.out.println(n);
            if (n == 2) {
                break;
            }
            System.out.println("block icindeyiz");
        }
        System.out.println("block disinda");

        //0
        //block icindeyiz
        //1
        //block icindeyiz
        //2


    }
}
